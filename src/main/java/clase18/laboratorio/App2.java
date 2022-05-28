package clase18.laboratorio;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		
		List<Persona> personas = new ArrayList<>();
		
		AdministrativoImpl adm = new AdministrativoImpl();
		personas.addAll(adm.listar(false));
		
		personas.forEach(System.out::println);

	}

}
