package miPrincipal;
import java.util.Queue;
import java.util.LinkedList;


public class ClienteMainQueue {
    public static void main(String[] args) {
        //creamos una cola generica
    Queue<String> micola= new LinkedList<String>(); 
    //Agregar tres elementos a la cola
    micola.add("Elemento 0");
    micola.add("Elemento 1");
    micola.add("Elemento 2");
    //Mostra el tamaño de la cola
    System.out.println("Tamaño de la cola: "+micola.size());
    //Mostra el primer elemento de la cola
    System.out.println("Muetra el primer elemento de la cola: "+micola.peek());
    //Eliminar el primero elemento de la cola
    micola.remove();
    System.out.println("Muetra el primer elemento de la cola: "+micola.peek());
    //Eliminar el primero elemento de la cola
    micola.remove();
    System.out.println("Muetra el primer elemento de la cola: "+micola.peek());
    //Eliminar el primero elemento de la cola
    micola.remove();
    System.out.println("Muetra el primer elemento de la cola: "+micola.peek());






        
    }
   



        
    

    
}
