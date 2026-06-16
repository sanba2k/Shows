package ar.com.unpaz.model;

public abstract class Show {
	
	private String tipoShow;
	private int idShow;
	private String artista;
	private double cantEntradas;
	private double precioEntrada;
	
	public Show(String tipoShow, int idShow, String artista, double cantEntradas, double precioEntrada) {
		this.tipoShow = tipoShow;
		this.idShow = idShow;
		this.artista = artista;
		this.cantEntradas = cantEntradas;
		this.precioEntrada = precioEntrada;
				
	}
	
	public Show(){
		
	}
	
	public abstract double calcularRecaudacion();
	
	
	public String getTipoShow() {
		return tipoShow;
	}

	public void setTipoShow(String tipoShow) {
		this.tipoShow = tipoShow;
	}

	public int getIdShow() {
		return idShow;
	}

	public void setIdShow(int idShow) {
		this.idShow = idShow;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getCantEntradas() {
		return cantEntradas;
	}

	public void setCantEntradas(double cantEntradas) {
		this.cantEntradas = cantEntradas;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	
	@Override
	public String toString() {
		return "Show [tipoShow=" + tipoShow + ", idShow=" + idShow + ", artista=" + artista + ", cantEntradas="
				+ cantEntradas + ", precioEntrada=" + precioEntrada + "]";
	}

}
