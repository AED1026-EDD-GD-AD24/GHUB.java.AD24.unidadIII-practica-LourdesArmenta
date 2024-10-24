package miPrincipal;
import lista.Lista;
import lista.PosicionIlegalException;

public class ClienteMainLista {
    public static void main(String[] args) {
        try{
            //Crear una lista
            Lista<Integer> lista = new Lista<Integer>();
            //agrego 3 elementos
            lista.agregar(12);
            lista.agregar(15);
            lista.agregar(20);
            //imprimir los alementos agregador
            System.out.println("Dato en la posicion 0 "+lista.getValor(0));
            System.out.println("Dato en la posicion 1 "+lista.getValor(1));
            System.out.println("Dato en la posicion 2 "+lista.getValor(2));
            //insertar al principio
            lista.insertar(40, 0);
            System.out.println();
            for(int i=0;i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
            }
            //insertar al final
            lista.insertar(50,3);
            System.out.println();
            for(int i=0;i<lista.getTamanio();i++){
               System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
            }
            //insertar en medio
            lista.insertar(60,2);
            System.out.println();
            for(int i=0;i<lista.getTamanio();i++){
                System.out.println("Dato en la posicion "+i+":"+lista.getValor(i));
            }




        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }
        
    }
    
}
