package miPrincipal;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        pila.push(2);
        pila.push(5);
        pila.push(7);
        System.out.println("El tamaño de la pila: "+pila.size());
        System.out.println("El elemento 2 se encuentra en la posicion "+pila.search(2));
        System.out.println("El elemento 5 se encuentra en la posicion "+pila.search(5));
        System.out.println("El elemento 7 se encuentra en la posicion "+pila.search(7));
        System.out.println("El tope de la pila:"+pila.peek());
        pila.pop();
        System.out.println("El tope de la pila:"+pila.peek());
        pila.pop();
        System.out.println("El tope de la pila:"+pila.peek());
        pila.pop();
        System.out.println("El tamaño de la pila: "+pila.size());
        //System.out.println("El tope de la pila:"+pila.peek()); //lanza una excepcion




        
    }
    
}
