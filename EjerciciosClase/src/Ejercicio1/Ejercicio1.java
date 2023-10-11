package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Desarrolla un programa que: 

Solicite palabras por pantalla al usuario  y pare cuando introduzca fin 

Almacene las palabras en un fichero de texto llamado “palabras.txt” en una carpeta llamada Ficheros,
 siempre que las palabras no tengan más de 8 letras 

Incluir un título en el fichero que sea Palabras de menos de 8 letras 
*/
public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos un scanner con el que el usuario escribira las palabras 
		Scanner teclado = new Scanner(System.in);
		
		try {
			//Creamos un archivo de escritura con filewriter e introducimos la ruta que debe tener
			FileWriter archivo = new FileWriter("src\\Ficheros\\palabras.txt");
			//Creamos un printwriter que nos escribira en el archivo
			PrintWriter escribir = new PrintWriter(archivo);
			
			//Creamos el titulo en el archivo
			escribir.println("Palabras de menos de 8 letras");
			
			while (true) {
				System.out.print("Introduce una palabra (o escribe 'fin' para terminar): ");
                String palabra = teclado.nextLine();
                
                if(palabra.equalsIgnoreCase("fin")) {
                	break;
			}
                if(palabra.length()<=8) {
                	//Si la palabra tiene menos de 8 caracteres escribir la imprimira en el archivo
                	escribir.println(palabra);
                	System.out.println("Palabra almacenada en el archivo 'palabras.txt' en la carpeta 'Ficheros'.");
                    System.out.println(palabra);
                }
                else {
                	System.out.println("la palabra "+palabra+" tiene mas de 8 letras");
                }
                
                
                // Cerrar el archivo
                escribir.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			teclado.close();
		}
		

	}

}
