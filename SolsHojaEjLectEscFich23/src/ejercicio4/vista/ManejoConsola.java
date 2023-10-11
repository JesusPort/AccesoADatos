package ejercicio4.vista;

import java.util.Scanner;

public class ManejoConsola {
	static Scanner scan= new Scanner(System.in);
	
	public static void mostrarMenu() {
		StringBuilder sb= new StringBuilder();
		sb.append("--------------------------------------\n");
		sb.append("ELIJA UNA DE LAS OPCIONES SIGUIENTES:\n");
		sb.append("\t1: Numero de palabras\n");
		sb.append("\t2: Numero de vocales\n");
		sb.append("\t3: Numero de consonantes\n");
		sb.append("\t4: Numero de espacios\n");
		sb.append("\t5: Salir");
		System.out.println(sb.toString());
	}

	public static int leerOpcion() {
		return scan.nextInt();
		
	}

	public static void escribir(String string, int valor) {
		System.out.println(string + valor);
		
		
	}


}
