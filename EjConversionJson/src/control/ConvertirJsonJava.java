package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import modelo.Alumno;


public class ConvertirJsonJava {

	static List<Alumno> alumnosList;
	static String jsonString;
	public static void main(String[] args) {
		alumnosList = new ArrayList<Alumno>();
		inicializarLista();
		escribirJson();
		leerJson();
		
	}
	
	private static void leerJson() {
		Gson gson= new Gson();
		Alumno[] arrayAlumnos= gson.fromJson(jsonString, Alumno[].class);
		List<Alumno> listaAlumnos= Arrays.asList(arrayAlumnos);
		System.out.println(listaAlumnos);
	}

	private static void escribirJson(){
		jsonString= new Gson().toJson(alumnosList);
		System.out.println(jsonString);
		
	}
	
	private static void inicializarLista() {
		alumnosList.add(new Alumno(2, "Perez", "Ana"));
		alumnosList.add(new Alumno(1, "Sanz", "Jose"));
		alumnosList.add(new Alumno(2, "Arranz", "Maria"));
		alumnosList.add(new Alumno(1, "Perez", "Juan"));
		// System.out.println(alumnosList);
	}

}
