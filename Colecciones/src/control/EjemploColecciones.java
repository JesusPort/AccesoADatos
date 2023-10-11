package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploColecciones {

	public static void main(String[] args) {
		List<Integer> enterosList = new ArrayList<Integer>();
		enterosList.add(3);
		List<Integer> entList= Arrays.asList(1,2,3,4,5);
		//Cambiamos el 1 por un 7
		entList.set(1, 7);
		
		//añadir todos los elementos de una lista en otra
		enterosList.addAll(entList);
		//enterosList= entList;
		System.out.println(enterosList);
		System.out.println(entList);
		
	}

}
