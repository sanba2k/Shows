package ar.com.unpaz.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.Show;
import ar.com.unpaz.model.ShowInternacional;
import ar.com.unpaz.model.ShowNacional;
import ar.com.unpaz.service.ILecturaService;

public class LeerArchivo implements ILecturaService{

	@Override
	public HashMap<Integer, Show> Lectura() {
		HashMap<Integer, Show> mapa = new HashMap<Integer, Show>();
		
		File sfile = new File("src/shows.txt");
	try {
		FileReader fiRe = new FileReader(sfile);
		BufferedReader buffer = new BufferedReader(fiRe);
		String Linea= "";
		while((Linea = buffer.readLine()) != null) {
			String [] array = Linea.split(";");
			String tipoShow = array[0];
			int idShow = Integer.parseInt(array[1]);
			String artista = array[2];
			double cantEntradas = Double.parseDouble(array[3]);
			double precioEntrada = Double.parseDouble(array[4]);
			
			switch(tipoShow) {
			case "I":
				String ubicacion = array[5];
				ShowInternacional inter = new ShowInternacional(tipoShow, idShow, artista, cantEntradas, precioEntrada, ubicacion);
				mapa.put(idShow, inter);
				break;
			
			case "N":
				ShowNacional nac = new ShowNacional(tipoShow,idShow, artista, cantEntradas, precioEntrada);
				mapa.put(idShow, nac);
				break;
			
			}
		}
		
		buffer.close();
	} catch(Exception e) 
	{e.printStackTrace();}
		
		
		return mapa;
	}
	

}
