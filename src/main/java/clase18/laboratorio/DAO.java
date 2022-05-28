package clase18.laboratorio;

import java.util.List;

public interface DAO<K, E> {
	
	boolean save(E element);
	
	List<E> listar();

}
