package clase18.calculadora.funcional;

public class App {

	public static void main(String[] args) {
		
		int resultado = 0, num1 = 1, num2 = 5;
		
		Calculadora cal;
		cal = (n1, n2) -> n1 + n2;
		resultado = cal.operacion(num1, num2);
		System.out.println("suma: " + resultado);
		
		cal = (n1, n2) -> n1 - n2;
		resultado = cal.operacion(num1, num2);
		System.out.println("resta: " + resultado);
		
		cal = (n1, n2) -> n1 * n2;
		resultado = cal.operacion(num1, num2);
		System.out.println("multiplicacion: " + resultado);

	}

}
