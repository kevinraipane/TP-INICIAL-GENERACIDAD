import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while(!salir){
            System.out.println("\n----------- Menú  --------------");
            System.out.println("1.Creación de un Almacén Genérico Simple ");
            System.out.println("2.Clase Genérica para Almacenar Pares ");
            System.out.println("3.Contenedor con Comparación Genérica ");
            System.out.println("4.Intercambiar Elementos en un Array Genérico ");
            System.out.println("5.Almacen con Búsqueda Genérica ");
            System.out.println("6.Contador de Elementos Repetidos ");
            System.out.println("7.Uso de ArrayList Genérico ");
            System.out.println("8.Almacenamiento y Filtrado en ArrayList ");
            System.out.println("9.Mapa Genérico con Clave-Valor ");
            System.out.println("10.Historial Genérico ");
            System.out.println("11.Salir");
            System.out.print("Ingrese un numero:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    //Cargo Strings
                    Almacen<String> almacenString = new Almacen<>();
                    almacenString.agregar("JIJI");
                    almacenString.agregar("jaja");
                    System.out.println("Elemento en el indice 0: " +almacenString.obtener(0));
                    System.out.println("Elemento en el indice 1: " +almacenString.obtener(1));
                    //Cargo Integer
                    Almacen<Integer> almacenInteger = new Almacen<>();
                    almacenInteger.agregar(10);
                    almacenInteger.agregar(20);
                    System.out.println("Elemento en el índice 0: " + almacenInteger.obtener(0));
                    System.out.println("Elemento en el índice 1: " + almacenInteger.obtener(1));
                    break;
                case 2:
                    //String con Integer
                    Par<String,Integer> par1 = new Par<>("Edad",25);
                    System.out.println("Par 1: 1er elemento= " +par1.obtenerPrimero()+ ", 2do elemento= " +par1.obtenerSegundo());
                    //Double con Boolean
                    Par<Double, Boolean> par2 = new Par<>(99.99, true);
                    System.out.println("Par 2: 1er elemento= " + par2.obtenerPrimero() + ", 2do elemento= " + par2.obtenerSegundo());
                    //Character con String
                    Par<Character,String> par3 = new Par<>('A',"Letra");
                    System.out.println("Par 3: 1er elemento= " + par3.obtenerPrimero() + ", 2do elemento= " + par3.obtenerSegundo());
                    break;
                case 3:
                    //Integer
                    Almacen<Integer> almacenEnteros = new Almacen<>();
                    almacenEnteros.agregar(10);
                    almacenEnteros.agregar(1);
                    almacenEnteros.agregar(25);
                    almacenEnteros.agregar(17);
                    System.out.println("Mayor elemento de almacenInteger: " +almacenEnteros.obtenerMayor());
                    //String
                    Almacen<String> almacenCadenas = new Almacen<>();
                    almacenCadenas.agregar("Manzana");
                    almacenCadenas.agregar("Naranja");
                    almacenCadenas.agregar("Banana");
                    almacenCadenas.agregar("Pera");
                    System.out.println("Mayor en Almacen<String>: " + almacenCadenas.obtenerMayor());
                    break;
                case 4:
                    //Integer
                    ArrayList<Integer> numeros = new ArrayList<>();
                    numeros.add(1);
                    numeros.add(2);
                    numeros.add(3);
                    numeros.add(4);
                    numeros.add(5);
                    System.out.println("ArrayList original de Integer:");
                    HerramientasArrayList.imprimirLista(numeros);
                    HerramientasArrayList.intercambiar(numeros, 1, 3);
                    System.out.println("ArrayList de Integer después de intercambiar:");
                    HerramientasArrayList.imprimirLista(numeros);
                    //String
                    ArrayList<String> cadenas = new ArrayList<>();
                    cadenas.add("Manzana");
                    cadenas.add("Naranja");
                    cadenas.add("Banana");
                    cadenas.add("Pera");
                    System.out.println("\nArrayList original de String:");
                    HerramientasArrayList.imprimirLista(cadenas);
                    HerramientasArrayList.intercambiar(cadenas, 0, 2);
                    System.out.println("ArrayList de String después de intercambiar:");
                    HerramientasArrayList.imprimirLista(cadenas);
                    break;
                case 5:
                    //Integer
                    Almacen<Integer> almacenEnteros5 = new Almacen<>();
                    almacenEnteros5.agregar(10);
                    almacenEnteros5.agregar(1);
                    almacenEnteros5.agregar(25);
                    almacenEnteros5.agregar(17);

                    System.out.println("Buscando numero: 10 // Resultado: "  +almacenEnteros5.buscar(25));
                    System.out.println("Buscando numero: 50 // Resultado: " +almacenEnteros5.buscar(50));

                    //String
                    Almacen<String> almacenCadenas5 = new Almacen<>();
                    almacenCadenas5.agregar("Manzana");
                    almacenCadenas5.agregar("Naranja");
                    almacenCadenas5.agregar("Pera");

                    System.out.println("Buscando 'Naranja': // Resultado: " + almacenCadenas5.buscar("Naranja"));
                    System.out.println("Buscando 'Sandia': // Resultado: " + almacenCadenas5.buscar("Sandia"));
                    break;
                case 6:
                    //Integer
                    ArrayList<Integer> numeros6 = new ArrayList<>();
                    numeros6.add(1);
                    numeros6.add(2);
                    numeros6.add(3);
                    numeros6.add(2);
                    numeros6.add(4);
                    numeros6.add(2);
                    numeros6.add(5);

                    int resultado = HerramientasArrayList.contarRepeticiones(numeros6,2);
                    System.out.println("El numero 2 aparece " +resultado+ " veces en el ArrayList.");

                    //String
                    ArrayList<String> frutas = new ArrayList<>();
                    frutas.add("manzana");
                    frutas.add("naranja");
                    frutas.add("banana");
                    frutas.add("manzana");
                    frutas.add("pera");

                    int repeticionesFrutas = HerramientasArrayList.contarRepeticiones(frutas, "manzana");
                    System.out.println("La fruta 'manzana' aparece " + repeticionesFrutas + " veces en el ArrayList de String.");
                    break;
                case 7:
                    Almacen<String> frutas7 = new Almacen<>();
                    frutas7.agregar("manzana");
                    frutas7.agregar("naranja");
                    frutas7.agregar("banana");
                    frutas7.agregar("manzana");
                    frutas7.agregar("pera");

                    frutas7.mostrarTodos();
                    frutas7.eliminar(2);
                    System.out.println("Elimino el elemento de indice 2.");
                    frutas7.mostrarTodos();
                    break;
                case 8:
                    /**
                    Almacen<Integer> numeritos8 = new Almacen<>();
                    numeritos8.agregar(5);
                    numeritos8.agregar(15);
                    numeritos8.agregar(8);
                    numeritos8.agregar(20);
                    numeritos8.agregar(3);

                    System.out.println("Numeros cargados:");
                    numeritos8.mostrarTodos();

                    //Filtro los mayores a 10
                    Almacen<Integer> mayoresQueDiez = numeritos8.filtrarPorCondicion(n -> n > 10);
                    */
                case 9:
                    //Almacen de String con Integer

                    break;
                case 11:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }

    }
}