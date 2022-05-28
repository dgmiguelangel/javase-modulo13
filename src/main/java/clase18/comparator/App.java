package clase18.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona(1, "Juan", "Lopez"));
		personas.add(new Persona(2, "Ana", "Gutierrez"));
		personas.add(new Persona(3, "Maria", "Gonzalez"));
		
		System.out.println("Ordenar por nombre");
		
		Collections.sort(personas, new OrdenarPersona());
		personas.forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		
		Comparator<Persona> ordPorNombre = (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre());
		Collections.sort(personas, ordPorNombre);
		personas.forEach(System.out::println);
		
		System.out.println("--------------------------------------");
		
		Collections.sort(personas, (Persona p1, Persona p2) -> p1.getApellido().compareTo(p2.getApellido()));
		personas.forEach(System.out::println);
		
	}

}
