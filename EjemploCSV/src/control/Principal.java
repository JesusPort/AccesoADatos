package control;

import modelo.datos.*;
import java.util.ArrayList;
import java.util.List;

import modelo.ManejoFicheros;

public class Principal {

	public static void main(String[] args) {
		List<String> contenidoFichero= ManejoFicheros.leerFicheroCompletoFilas("Files/capitales.csv");
		//System.out.println(contenidoFichero);
		List<Capital> capitalesList= new ArrayList<Capital>();
		contenidoFichero.remove(0);
		for(String linea: contenidoFichero) {
			String[] eltos= linea.split(";");
			//System.out.println(eltos[0]+"-"+eltos[1]+"-"+eltos[2]);
			capitalesList.add(new Capital(eltos[1],eltos[2]));
		}
		capitalesList.forEach(System.out::println);
	}

}
