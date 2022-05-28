package clase18.lambdas;

public class AppEsPar {

	public static void main(String[] args) {
		
		EsPar esp;
		
		esp = n -> n % 2 == 0;
		System.out.println("es par? " + esp.evaluar(8));

	}

}
