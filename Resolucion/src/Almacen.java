import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    //Metodo para eliminar un elemento por su indice
    public void eliminar(int indice)
        throws IndexOutOfBoundsException{
        if(indice < 0 || indice >= elementos.size()){
            throw new IndexOutOfBoundsException("Indice fuera de rango.");
        }
        elementos.remove(indice);
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

    //Metodo para imprimir todos los elementos
    public void mostrarTodos(){
        for(T elemento : elementos){
            System.out.println(elemento);
        }
    }

    //Metodo para filtrar elementos segun una condicion
    public ArrayList<T> filtrarPorCondicion(Predicate<T> condicion){
        ArrayList<T> filtrados = new ArrayList<>();
        for(T elemento : elementos){
            if(condicion.test(elemento)){
                filtrados.add(elemento);
            }
        }
        return filtrados;
    }
}
