/**
 * @author Jimena Hernández
 * Clase que implementa la calculadora
 * @version 19/02/2022
 */

public class MyCalculadora implements Calculadora {

    private Stack miStack;

    public MyCalculadora(){
        miStack= new MyStack(); //creación del stack
    }

    /**
     * @param vector
     * @return res 
     */
    public int Evaluate(String vector){
        int res = 0;
        String[] partes = vector.split(" "); //Separación de dígitos y operandos por medio de un espacio en blanco
        for (int i = 0; i < partes.length; i++) {
            try{
                miStack.push(Integer.parseInt(partes[i])); //Push si es un número  Ref: https://w3api.com/Java/Integer/parseInt/
            
            } catch (Exception e) {
                switch(partes[i]){   //Si es un operador pasa al catch y se resuelve para el caso necesario
                    
                    //si operador es +
                    case "+": 
                        res = (int)miStack.pull()+(int)miStack.pull();
                        miStack.push(res);
                    break;
                    //si operador es -
                    case "-": 
                        res = (int)miStack.pull()-(int)miStack.pull();
                        miStack.push(res);
                    break;
                    //si operador es *
                    case "*":
                        res = (int)miStack.pull()*(int)miStack.pull();
                        miStack.push(res);
                    break;
                    //si operador es /
                    case "/": 
                        res = (int)miStack.pull()/(int)miStack.pull();
                        miStack.push(res);
                    break;
                }
            }
            
        }
        return res; //retono del resultado de la operación

    }


}
