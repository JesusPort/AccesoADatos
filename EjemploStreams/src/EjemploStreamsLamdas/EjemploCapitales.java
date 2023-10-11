package EjemploStreamsLamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploCapitales {

	public static void main(String[] args) {
		//Inicializamos la lista de capitales
		//Lista por pantalla de los paises
		//Lista de capitales
		//Barajar los elementos
		//ordenarlos por paises
		//ordenarlos por capitales
		//devuelva la capital de un pais
		//Devuelva la capital de un pais y 3 capitales mas
		//Devuelva la capital de un pais y 3 capitales mas aleatorias
		
		
		
		
		
		List<Capital>capitalList= new ArrayList<Capital>();
		capitalList.add(new Capital("Francia","Paris"));
		capitalList.add(new Capital("Espana","Madrid"));
		capitalList.add(new Capital("Italia","Roma"));
		capitalList.add(new Capital("Alemania","Berlin"));
		//Lista de los paises por pantalla
		
		System.out.println("Los paises son: ");
		capitalList.forEach(x-> System.out.print(" "+x.getPais()));
		System.out.println();
		List<String> paisesList=capitalList.stream().map(Capital::getPais).toList();
		System.out.println(paisesList);
		
		List<String> paisesList2=capitalList.stream().map(x->x.getPais()).toList();
		System.out.println(paisesList2);
		//Lista de las capitales
		List<String> CapitalnombresList= capitalList.stream().map(Capital::getCapital).toList();
		System.out.println("Las capitales son: "+CapitalnombresList);
		capitalList.forEach(x-> System.out.print(" "+x.getCapital()));
		System.out.println();
		List<String> capitalesList2=capitalList.stream().map(x->x.getCapital()).toList();
		System.out.println(capitalesList2);
	
		//Barajar los elementos
		System.out.println(capitalList);
		Collections.shuffle(capitalList);
			
		//Ordenar por paises
		capitalList.sort((x,y)->x.getPais().compareTo(y.getPais()));
		System.out.println(capitalList);
		
		
		//Ordenar por capital
		capitalList.sort((x,y)->x.getCapital().compareTo(y.getCapital()));
		System.out.println(capitalList);
		
		//Devuelva la capital de un pais
		String pais="Alemania";
		capitalList.stream().filter(x->x.getPais()=="Alemania").map(Capital::getCapital).forEach(System.out::println);
		
		//devuelva la capital de un pais y 3 capitales mas
		List<String> capitales = new ArrayList<String>();
		capitales.add(capitalList.stream().filter(x->x.getPais().equalsIgnoreCase(pais)).map(Capital::getCapital).findAny().orElse(null));
		Collections.shuffle(capitalList);
		System.out.println(capitales);
		capitales.addAll(capitalList.stream().filter(x->!x.getPais().equalsIgnoreCase(pais)).map(Capital::getCapital).limit(3).toList());
		System.out.println(capitales);
		
	}

}
