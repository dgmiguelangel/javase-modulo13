package clase18.lambdas;

@FunctionalInterface
public interface Validar {

	boolean validarClave(String clave, int longitud);
}
