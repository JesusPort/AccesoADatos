package control;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Desarrolla un programa que: 
    Solicite al usuario el nombre del fichero
    Solicite frases al usuario por pantalla. 
    Cuando quiera terminar escribirá un 0 
     Pregunte al usuario si desea realizar una copia del fichero y si quiere, 
     con qué nombre y en qué directorio, dentro del proyecto (si no existe, se crea) 
  */
public class Ejercicio2 {
	static Scanner scan= new Scanner (System.in);

	public static void main(String[] args) {
		String nombreFichero, frase;
		List<String> contenido;
		
		escribirMensaje("Escriba el nombre del fichero con extensión");
		nombreFichero=leerFrase();
		escribirMensaje("Escriba frases por pantalla, cuando quiera parar inserte un 0");				
		frase=leerFrase();
		contenido= new ArrayList<String>();
		contenido.add("\t\t\tFrases\n");
		while(!frase.equals("0")) {
			contenido.add(frase);
			frase=leerFrase();
		}
		escribirFichero(contenido,"Files/"+nombreFichero);
		escribirMensaje ("Desea hacer una copia del fichero?s/n");
		if (leerFrase().toLowerCase().equals("s")) {
			escribirMensaje("Escriba el nombre con la ruta del nuevo fichero:");			
			escribirFichero(contenido, leerFrase());
		}	

	}
	
	public static void escribirMensaje(String mensaje) {
		System.out.println("-------------------------------------------------------");
		System.out.println(mensaje);
		System.out.println("-------------------------------------------------------");
	}
	public static String leerFrase() {
		return scan.nextLine();
	}
	public static void escribirFichero(List<String> contenido, String nombreFichero) {
		Path fichEscritura= Paths.get(nombreFichero);
		try {
			Files.write(fichEscritura, contenido, StandardCharsets.ISO_8859_1);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}


}
