package ar.com.unpaz.service;

public interface IServiceShows {
	
	void mostrarShows();
	
	void buscarShow(int id);
	
	double recaudacionTotal();
	
	double showConMayorRecaudacion();
	
	long cantShowsNacional();
	
	void recaudacionMayor10M();
	
	double promedioRecaudacionShowsNac();
	
	void listaArtistasInternacionales();
	
	
	
}
