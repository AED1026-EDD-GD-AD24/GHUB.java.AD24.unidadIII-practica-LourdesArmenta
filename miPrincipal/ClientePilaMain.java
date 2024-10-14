package miPrincipal;
import pila.Pila;
public class ClientePilaMain{
    public static void main(String[] args){
        //Crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        //apilar algunos elementos
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tamaño de la pilas es:"+pila.getTamanio());
        System.out.println("El tope de la pila es:"+pila.cima());
        //se desapila
        pila.retirar();
        System.out.println("El tope de la pila es:"+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es:"+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es:"+pila.cima());
        System.out.println("El tamaño de la pilas es:"+pila.getTamanio());
        




        
    }
}