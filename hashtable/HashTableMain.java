package hashtable;
import java.util.Hashtable;
import java.util.Enumeration;


public class HashTableMain {
    public static void main(String[] args) {
        //instanciar varias personas
        Persona p1 = new Persona("Pablo",23,"Argentino");
        Persona p2 = new Persona("Juan",25,"Mexicano");
        Persona p3 = new Persona("Pedro",18,"Español");
        Persona p4 = new Persona("Juan",50,"Español");
        //Crear la hashtable
        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        //Inserto tres elementos en la tabla
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);
        tabla.put(p4.getNombre(),p4);
        //acceso a los elementos de la tabla
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pedro"));

        System.out.println(tabla.get("Petra"));

        //obtener una enumeracion de las claves existentes en la tabla
        //la recorro y por cada uno accedo al elemento asociado
        //para mostrar clave=valoe

        String aux;
        Enumeration<String> keys = tabla.keys();
        while(keys.hasMoreElements()){
            aux=keys.nextElement();
            System.out.println(aux +" = "+tabla.get(aux));

        }






    }
    
}
