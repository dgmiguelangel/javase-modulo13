package clase18.calculadora.imperativo;

public interface Calculadora {
	
	static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	static int restar(int num1, int num2) {
		return num1 - num2;
	}
	
	static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	static int dividir(int num1, int num2) {
		return num1 / num2;
	}

}
