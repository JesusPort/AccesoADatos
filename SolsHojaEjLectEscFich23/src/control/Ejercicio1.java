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
Desarrolla un programa que: 
Solicite palabras por pantalla al usuario  y pare cuando introduzca fin 
Almacene las palabras en un fichero de texto llamado “palabras.txt” en una carpeta llamada Ficheros, 
siempre que las palabras no tengan más de 8 letras 
Incluir un título en el fichero que sea Palabras de menos de 8 letras */
public class Ejercicio1 {
	static Scanner scan= new Scanner (System.in);
	public static void main(String[] args) {
		escribirMensaje("Escriba palabras por pantalla, cuando quiera parar inserte la palabra fin");
		String palabra;		
		palabra=leerPalabra();
		List<String> contenido= new ArrayList<String>();
		contenido.add("\t\t\tPalabras de menos de 8 letras\n");
		while(!palabra.toLowerCase().equals("fin")) {
			if (palabra.length()<=8) {contenido.add(palabra);}
			palabra=leerPalabra();
		}
		escribirFichero(contenido,"Files/Ejercicio1.txt");

	}
	public static void escribirMensaje(String mensaje) {
		System.out.println("--------------------------------------");
		System.out.println(mensaje);
		System.out.println("--------------------------------------");
	}
	public static String leerPalabra() {
		return scan.next();
	}
	public static void escribirFichero(List<String> contenido, String nombreFichero) {
		Path fichEscritura= Paths.get(nombreFichero);
		try {
			Files.write(fichEscritura, contenido, StandardCharsets.UTF_8);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}

}
