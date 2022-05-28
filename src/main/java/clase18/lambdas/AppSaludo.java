package clase18.lambdas;

public class AppSaludo {

	public static void main(String[] args) {
		
		
		Saludo s = m -> {
			System.out.println(m);
		};
		
		s.mensaje("Hola Mundo!!");

	}

}
