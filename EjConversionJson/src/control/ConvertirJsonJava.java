package control;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import modelo.Alumno;


public class ConvertirJsonJava {

	static List<Alumno> alumnosList;
	public static void main(String[] args) {
		alumnosList = new ArrayList<Alumno>();
		inicializarLista();
		escribirJson();
		
	}
	
	private static void escribirJson(){
		String jsonString= new Gson().toJson(alumnosList);
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
