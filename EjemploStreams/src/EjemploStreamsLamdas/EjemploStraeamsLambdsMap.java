package EjemploStreamsLamdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploStraeamsLambdsMap {

	public static void main(String[] args) {
		Map<Integer, Persona> personasMap = new HashMap<Integer,Persona>();
		personasMap.put(1, new Persona("Adrian",14, null));
		personasMap.put(1, new Persona("Pedro",16, null));
		personasMap.put(1, new Persona("Laura",20, null));
		
		personasMap.forEach((k,v)->System.out.println("Clave:"+k+"-Valor:"+v));
		personasMap.forEach((k,v)->{
			if(v.getEdad()<=20) System.out.println("2-Clave: "+k+"-Valor: "+v);
		});
		
		personasMap.values().stream().filter(x->x.getEdad()>20).collect(Collectors.toList());
		System.out.println(personasMap);
		List<Integer>clavesList= personasMap.keySet().stream().filter(x->x<3).collect(Collectors.toList());
		
		
		List<Persona>personasList=new ArrayList<Persona>();
		personasList.add(new Persona("Pedro",16, null));
		
		//Ejemplo de anyMatch: si hay elementos que concuerdan con la condicion
		
		if(personasList.stream().anyMatch(x->x.getNombre().length()>5)) {
			System.out.println("Hay nombres mas largos");
		}else System.out.println("No los hay");
		
		
		//allMatch: todos los elementos cumplen la condicion
		
		if(personasList.stream().allMatch(x->x.getNombre().length()>3)) {
			System.out.println("Son mas largos de 3 letras");
		}else System.out.println("Algun nombre tiene 3 letras");
			
		
		//Ejemplo de count
		System.out.println(personasList.stream().filter(x->x.getEdad()>19).count());
		
		//Distinc: eliminar duplicados
		//personasList.add(new Persona("Pedro",16, null));
		Persona p1 = new Persona("Nuevo",24, null); 
		personasList.add(p1);
		personasList.add(p1);
		
		System.out.println(personasList.stream().distinct().collect(Collectors.toList()));
		
		
		
		//Mapeo: nos quedamos con parte de la estructura
		
		List<Integer> edadesList= personasList.stream().map(x->x.getEdad()).collect(Collectors.toList());
		System.out.println(edadesList);
		
		List<String> nombresList= personasList.stream().map(Persona::getNombre).toList();
		System.out.println(nombresList);
		
		//sumas
		System.out.println(edadesList.stream().mapToInt(Integer::intValue).sum());
		System.out.println(personasList.stream().mapToInt(Persona::getEdad).sum());
		
		
		//Referencia
		personasList.forEach(System.out::println);

	}

}
