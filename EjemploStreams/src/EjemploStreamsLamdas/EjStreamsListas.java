package EjemploStreamsLamdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjStreamsListas {

	public static void main(String[] args) {
		List<Integer> enterosList = Arrays.asList(34,54,43,67,12);
		
		//Filtramos valores de una lista y volvemos a convertir en lista
		System.out.println(enterosList.stream().filter(x->x>50).collect(Collectors.toList()));
		
		
		

	}

}
