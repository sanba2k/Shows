package ar.com.unpaz.repo;

import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Show;
import ar.com.unpaz.service.IServiceShows;

public class ShowImp implements IServiceShows{
	
	LeerArchivo lectura = new LeerArchivo();
	HashMap<Integer, Show> mapa = lectura.Lectura();
	
	
	@Override
	public void mostrarShows() {
		for(Show c : mapa.values()) {
			System.out.println(c);
			System.out.println(c.calcularRecaudacion());
		}
		
		
	}

	@Override
	public void buscarShow(int id) {
		for(Show c : mapa.values()) {
			if(c.getIdShow() == id) {
				System.out.println(c);
				return;
			}
		}
		
	}

	@Override
	public double recaudacionTotal() {
		double total= mapa.values().stream().
							mapToDouble(a -> a.calcularRecaudacion()).
							sum(); 
				
		return total;
	}

	@Override
	public double showConMayorRecaudacion() {
		double total = mapa.values().stream().
							mapToDouble(a -> a.calcularRecaudacion()).
							max().orElse(0.0);
		
		return total;
	}

	@Override
	public long cantShowsNacional() {
		long cantidad = mapa.values().stream().
							filter(a -> a.getTipoShow().equals("N")).
							count();
		
		return cantidad;
	}

	@Override
	public void recaudacionMayor10M() {
		mapa.values().stream().
						filter(a -> a.calcularRecaudacion() > 10000000).
						forEach(a -> System.out.println(a));
		
	}

	@Override
	public double promedioRecaudacionShowsNac() {
		double prom = mapa.values().stream().
						filter(a -> a.getTipoShow().equals("N")).
						mapToDouble(a -> a.calcularRecaudacion()).
						average().
						orElse(0.0);
		
		return prom;
	}

	@Override
	public void listaArtistasInternacionales() {
		List<Show> lista = mapa.values().stream().
								filter(a -> a.getTipoShow().equals("I")).toList();
		
		lista.forEach(a -> System.out.println(a));
	}

}
