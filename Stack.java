/**
 * @author Jimena Hernández
 * Clase Stack
 * Interfaz del stack
 */

 public interface Stack <E>{

    /**
     * 
     * @param elemento
     * pre: 
     * post: item is added to stack
     * will be popped next if no intervening push
     */
	public void Push (E elemento);

    /**
     * 
     * @return
     * pre: stack is not empty
     * post: most recently pushed item is removed and returned
     */
	public E Pop();

    /**
     * 
     * @return
     * post: returns true if and only if the stack is empty
     */
	public boolean IsEmpty();

    /**
    * 
    * @return 
    * post: returns the number of elements in the stack
    */
   public int size();

   /**
    * 
    * @return 
    * pre: stack is not empty
    * post: top value (next to be popped) is returned
    */
   public E peek();
    
}
