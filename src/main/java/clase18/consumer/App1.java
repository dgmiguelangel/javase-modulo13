package clase18.consumer;

import java.util.Arrays;
import java.util.List;

public class App1 {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel");
		
		System.out.println("Iteracion tradicional");
		for (String n : nombres) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n-----------------------------------------");
		
		System.out.println("Iteracion funcional");
		nombres.forEach(nom -> System.out.print(nom + " "));// consumer

	}

}
