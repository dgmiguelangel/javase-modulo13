package clase18.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel");
		
		List<String> nombresS = new ArrayList<String>();
		
		System.out.println("Nombres que comienzan con 'S' + Modo tradicional");
		for (String n : nombres) {
			if(n.startsWith("S")) {
				nombresS.add(n);
			}
		}
		
		nombresS.forEach(n -> System.out.print(n + " "));
		
		System.out.println("\nNombres que comienzan con 'S' - Modo funcional");
		nombresS = nombres.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
		nombresS.forEach(n -> System.out.print(n + " "));		

	}

}
