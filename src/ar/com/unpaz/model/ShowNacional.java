package ar.com.unpaz.model;

public class ShowNacional extends Show{

	public ShowNacional(String tipoShow, int idShow, String artista, double cantEntradas, double precioEntrada) {
		super(tipoShow, idShow, artista, cantEntradas, precioEntrada);
	}
	
	@Override
	public double calcularRecaudacion() {
		double total = getCantEntradas() + getPrecioEntrada();
		
		return total;
	}

}
