package control;

import java.util.List;


import java.util.ArrayList;
import modelo.ManejoFicheros;
import modelo.datos.Vivienda;

//Obtener una lista de establecimientos
		//1- Preguntar por un tipo y filtrar todos los establecimientos de ese tipo
		//2- Obtener todos los establecimientos que están en calle
		//3- Obtener la dirección, número y tipo de establecimiento de la puerta del sol
       //4- Obtener todos los establecimientos ordenados por el nombre de la calle
		//5- Obtener todos los establecimientos ordenados por nombre de la calle y número
		//6- Obtener los nombres de las calles en las que hay establecimiento

public class Principal {

	public static void main(String[] args) {
		List<String> contenidoFichero= ManejoFicheros.leerFicheroCompletoFilas("Files/actividadesEconomicas2023.csv");
		List<Vivienda> viviendaList= new ArrayList<Vivienda>();
		contenidoFichero.remove(0);
		
		for(String linea:contenidoFichero) {
			String[] elementos = linea.split(";");
			viviendaList.add(new Vivienda(elementos[26],elementos[27],  Integer.parseInt(elementos[29]),elementos[46]));
		}
		viviendaList.forEach(System.out::println);
	}

}
