package ar.com.unpaz.inicio;

import java.util.Scanner;

import ar.com.unpaz.repo.ShowImp;
import ar.com.unpaz.service.IServiceShows;

public class Inicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IServiceShows servicio = new ShowImp();
		
	int opcion;
			
			do {
				System.out.println(" iniciando ");
				System.out.println("1 Mostrar todos los shows ");
				System.out.println("2 Buscar un show por código");
				System.out.println("3 recaudacion total");
				System.out.println("4 show con mayor recaudación");
				System.out.println("5 cuántos shows internacionales hay");
				System.out.println("6 shows con recaudación mayor a $10.000.000");
				System.out.println("7 promedio de recaudación de shows nacionales");
				System.out.println("8 nombres de artistas internacionales");
				System.out.println("9 salir");
				System.out.println("Elegir opcion:   ");
				opcion = scanner.nextInt();
				scanner.nextLine();
				
				switch(opcion) {
				case 1:
					servicio.mostrarShows();
					break;
				
				case 2:
					System.out.println("Introducir id del show");
					int num = scanner.nextInt();
					
					servicio.buscarShow(num);
					break;
					
				case 3:
					System.out.println("La recaudacion total fue de: " + servicio.recaudacionTotal());
					break;
					
				case 4:
					 servicio.showConMayorRecaudacion();
					break;
					
				case 5:
					System.out.println("La cantidad de shows nacionales son: " + servicio.cantShowsNacional());
					break;
					
				case 6:
					servicio.recaudacionMayor10M();
					break;
				
				case 7:
					System.out.println(servicio.promedioRecaudacionShowsNac());
					break;
					
				case 8:
					servicio.listaArtistasInternacionales();
					break;
					
				default:
					System.out.println("Saliendo... ... .. . ");
				}
				
				
			} while(opcion != 9);
			scanner.close();
	
		}

}
