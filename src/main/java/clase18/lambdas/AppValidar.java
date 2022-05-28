package clase18.lambdas;

public class AppValidar {

	public static void main(String[] args) {
		
		Validar v = (clave, longitud) -> clave.contains("#") && clave.length() > 6;
		
		System.out.println(v.validarClave("Jose123", 8));
		

	}

}
