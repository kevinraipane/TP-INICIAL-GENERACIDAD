import java.util.HashMap;
import java.util.Map;

public class AlmacenMapa<K,V> {
    private Map<K,V> mapa;

    //Constructor
    public AlmacenMapa(){
        mapa = new HashMap<>();
    }

    //Metodo para agregar un elemento al mapa
    public void agregar(K clave,V valor){
        mapa.put(clave,valor);
    }

    //Metodo para obtener un elemento por su clave
    public V obtener(K clave){
        return mapa.get(clave);
    }

    //Metodo para eliminar un elemento por su clave
    public V eliminar(K clave){
        return mapa.remove(clave);
    }

    //Metodo para mostrar todos los elementos del mapa
    public void mostrarTodos(){
        for(K clave : mapa.keySet()){
            V valor = mapa.get(clave);
            System.out.println("Clave: " +clave+ ", Valor: " +valor);
        }
    }
}
