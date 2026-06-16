package ar.com.unpaz.model;

public class ShowInternacional extends Show{

	private String ubicacion;
	

	public ShowInternacional(String tipoShow, int idShow, String artista, double cantEntradas, double precioEntrada, String ubicacion){
		super(tipoShow, idShow, artista, cantEntradas, precioEntrada);
		this.ubicacion = ubicacion;
			
	}
	
	
	@Override
	public double calcularRecaudacion() {
		double total = 0;
		
		if(getTipoShow().equals("VIP")) {
			total = getCantEntradas() * getPrecioEntrada() + 500000;
		}
		if(getTipoShow().equals("CAMPO")) {
			total = getCantEntradas() * getPrecioEntrada() + 200000;
		} else {
			total = getCantEntradas() * getPrecioEntrada() + 100000;
		}
		
		
		return total  ;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
}
