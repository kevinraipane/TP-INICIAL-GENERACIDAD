import java.util.ArrayList;

public class HerramientasArrayList {
    //Metodo para imprimir un array generico
    public static <T> void imprimirLista(ArrayList<T> lista){
        for(T elemento : lista){
            System.out.println(elemento+ " ");
        }
        System.out.println();
    }

    //Metodo generico para intercambiar elementos en un ArrayList
    public static <T> void intercambiar(ArrayList<T> lista,int indice1,int indice2){
        if(indice1 < 0 || indice1 >= lista.size() || indice2 < 0 || indice2 >= lista.size()){
            throw new IndexOutOfBoundsException("Indice fuera de rango.");
        }

        T aux = lista.get(indice1);
        lista.set(indice1,lista.get(indice2));
        lista.set(indice2,aux);
    }

    //Metodo generico para contar repeticiones de un elemento en un ArrayList
    public static <T> int contarRepeticiones(ArrayList<T> lista, T elemento){
        int contador = 0;
        for(T e : lista){
            if(e.equals(elemento)){
                contador++;
            }
        }
        return contador;
    }
}
