package control;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Escribe un programa que lea un fichero de text de varias 
//línea y devuelva el 
//- número total de palabras que contiene, 
//- número de vocales, 
//- de consonantes
// - de espacios en blanco
public class Ejercicio4 {

	public static void main(String[] args) {
		List<String> contenido= leerFichero("Files/EntradaTexto.txt");
		String cadenaContenido = convertirCadena(contenido);
	
		System.out.println("Número de palabras: "+ numPalabras(cadenaContenido));
		System.out.println("Número de vocales: " + numVocales(cadenaContenido));
		System.out.println("Número de consonantes: " + numConsonantes(cadenaContenido));
		System.out.println("Espacios en blanco: "+ numEspacios(cadenaContenido));
	}

	private static int numEspacios(String texto) {
		int numEspacios=0;
		numEspacios= texto.length()- texto.replaceAll("[ ]" ,"").length();
		return numEspacios;
	}

	private static int numConsonantes(String texto) {
		int numConsonantes=0;
		//numConsonantes= texto.length()- texto.toLowerCase().replaceAll("[b-df-hj-np-tv-zñ]", "").length();
		numConsonantes=texto.toLowerCase().replaceAll("[\\W_aeiou^ñ]", "").length();
		return numConsonantes;
	}

	private static int numVocales(String texto) {
		int numVocales=0;
		numVocales= texto.length()- texto.toLowerCase().replaceAll("[aeiouáéíóú]", "").length();
		return numVocales;
	}

	private static int numPalabras(String texto) {
		texto= texto.replaceAll("[ ,;:-]",";").replaceAll(";;", ";").replaceAll(";;", ";");
		String[] arrayTexto=texto.split("[;]");
	//	System.out.println(Arrays.toString(arrayTexto));
		return arrayTexto.length;
	}

	private static String convertirCadena(List<String> contenido) {
		StringBuilder cadena= new StringBuilder();
		for (String fila: contenido) {
			cadena.append(fila.trim());
		}
		return cadena.toString();
	}

	public static List<String> leerFichero(String fichero) {
		Path fichEntrada= Paths.get(fichero);
		List<String> contenido=new ArrayList<String>();		
		try {
			contenido= Files.readAllLines(fichEntrada);				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return contenido;
	}
	
}
