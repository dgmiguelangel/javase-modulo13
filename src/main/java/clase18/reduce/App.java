package clase18.reduce;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel");
		
		String nombresC = "";

		System.out.println("Forma Tradicional: ");
		for (String n : nombres) {
			nombresC += n;
		}
		
		System.out.println(nombresC);
		
		System.out.println("---------------------------------");
		
		System.out.println("Forma Funcional: ");
		nombresC = nombres.stream().reduce("", (nom1, nom2) -> nom1 + nom2);
		System.out.println(nombresC);
		
	}

}
