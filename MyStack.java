/**
 * @author Jimena Hernández
 * Clase que implementa el stack
 * @version 19/02/2022
 */
import java.util.Vector;

public class MyStack<E> implements Stack<E> {
    
    private Vector<E> vec;

    public MyStack(){
        vec = new Vector<E>();
    }

    /** 
    * @param elemente
    * Agregar elementos 
    */
    public void Push(E element) { 
		vec.addElement(element);
	}

    /**
     * 
     * @return 
     * Eliminar el utlimo valor dentro de la pila
     */
    public E Pop(){
        return (vec.remove(vec.size()-1));
    }

    /**
     * 
     * @return 
     * Devuelve true si está vacío y false si esta lleno
     */
    public boolean IsEmpty(){
        return vec.isEmpty();
    }

    /**
     * 
     * @return 
     * Devolver el ultimo valor 
     */
    @Override
    public E peek() {
        return vec.get(vec.size()-1);
    }

    /**
     * 
     * @return 
     * Devuelve el tamaño del vector
     */
    @Override
    public int size() {
        return vec.size();
    }



}
