package miPrincipal;
import cola.Cola;

public class ClienteMainCola {
    public static void main(String[] args) {
        //Crear una cola de enteros
        Cola<Integer> cola = new Cola<Integer>();
        //se encolan algunos elementos
        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);
        //se imprime el primer elemento de la cola
        System.out.println("El primero elemento de la cola: "+cola.frente());
        
    }
    
}
