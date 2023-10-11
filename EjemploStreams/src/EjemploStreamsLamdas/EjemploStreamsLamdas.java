package EjemploStreamsLamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamsLamdas {

	public static void main(String[] args) {
		List<Integer> enterosList = Arrays.asList(34,54,43,67,12);
		enterosList.sort(null);
		System.out.println(enterosList);
		
		List<Persona> personasList = new ArrayList<Persona>();
		personasList.add(new Persona("mario",19,"Jer"));
		personasList.add(new Persona("Pedro",25,"Jose"));
		personasList.add(new Persona("Ana",23,"Maria"));
		
		personasList.sort((x,y)->x.getNombre().compareTo(y.getNombre()));
		System.out.println(personasList);
		personasList.sort((x,y)->x.getEdad()-y.getEdad());
		System.out.println(personasList);
		
		
		personasList.forEach(x->System.out.println("-"+x));

	}

}
