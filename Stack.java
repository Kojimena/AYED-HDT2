/**
 * @author Jimena Hernández
 * Clase Stack
 * Interfaz del stack
 */

 public interface Stack <E>{

    /**
     * 
     * @param elemento
     */
	public void Push (E elemento);

    /**
     * 
     * @return
     */
	public E Pop();

    /**
     * 
     * @return
     */
	public boolean IsEmpty();

    /**
    * 
    * @return 
    */
   public int size();

   /**
    * 
    * @return 
    */
   public E peek();
    
}
