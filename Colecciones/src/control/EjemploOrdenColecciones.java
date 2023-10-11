package control;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EjemploOrdenColecciones {

	public static void main(String[] args) {
		List<Integer> enterosList = Arrays.asList(34,98,12,56,75);
		Collections.sort(enterosList);
		System.out.println(enterosList);
		
		List<String> palabrasList = Arrays.asList("Hola","adios","Hasta Luego");
		Collections.sort(palabrasList);
		System.out.println(palabrasList);
		
		//Ejemplo de orden con arrayList de objetos
		
		List<Persona> personasList = new ArrayList<Persona>();
		personasList.add(new Persona("Ana","Rubio",30));
		personasList.add(new Persona("Pedro","Gala",30));
		personasList.add(new Persona("Juan","Aguilas",30));
		personasList.add(new Persona("Toni","Gomez",30));
		personasList.add(new Persona("Sara","Lui",30));
		Collections.sort(personasList);
		System.out.println(personasList);
		
		Collections.shuffle(personasList);
		System.out.println(personasList);
		
		

	}

}
