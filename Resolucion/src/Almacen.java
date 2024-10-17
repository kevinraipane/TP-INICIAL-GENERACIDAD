import java.util.ArrayList;
import java.util.List;

public class Almacen <T extends Comparable<T>>{
    private List<T> elementos;

    public Almacen(){
        elementos = new ArrayList<>();
    }

    //Metodo para agregar un elemento al almacen
    public void agregar(T elemento){
        elementos.add(elemento);
    }

    //Metodo para obtener un elemento por su indice
    public T obtener(int indice){
        if(indice >= 0 && indice < elementos.size()){
            return elementos.get(indice);
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango.");
        }
    }

    //Metodo para obtener el mayor elemento
    public T obtenerMayor(){
        if(elementos.isEmpty()){
            return null;
        }
        T mayor = elementos.get(0);
        for(T elemento : elementos){
            if(elemento.compareTo(mayor) > 0){
                mayor = elemento;
            }
        }
        return mayor;
    }

    //Metodo para buscar un elemento
    public int buscar(T elemento){
        int indice = elementos.indexOf(elemento);
        return indice; //-1 si indexOf no encuentra el elemento en la lista
    }
}
