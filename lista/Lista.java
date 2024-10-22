package lista;

public class Lista <T>{
    private Nodo<T> cabeza;
    private int tamanio;

    public Lista() {
        cabeza = null;
        tamanio = 0;

    }

    public int getTamanio() {
        return tamanio;
    }
    /**
     * Consulta si la lista es vacia
     * @return true cuando es vacia, false cuando no
     */
    public boolean esVacia(){
        if(cabeza==null)
           return true;
        else
           return false;
    }
    

    

    
}
