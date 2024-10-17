# TP-INICIAL-GENERACIDAD
Guia inicial de generacidad

Ejercicio 1: Creación de un Almacén Genérico Simple 
Implementa una clase genérica Almacen<T> (el ejemplo de clase). El almacén debe poder guardar 
elementos de cualquier tipo. La clase debe tener los siguientes métodos: 
• agregar(T elemento): para agregar elementos al almacén. 
• obtener(int indice): para obtener un elemento por su índice. 
• Pronbar la clase con tipos diferentes, como String e Integer. 

Ejercicio 2: Clase Genérica para Almacenar Pares 
Crear una clase genérica Par<T, U> que almacene dos elementos de tipos diferentes (por ejemplo, un 
String y un Integer). La clase debe tener métodos para: 
• Obtener el primer elemento. 
• Obtener el segundo elemento. Prueba tu clase creando instancias de Par con diferentes tipos, 
como Par<String, Integer> y Par<Double, Boolean>. 

Ejercicio 3: Contenedor con Comparación Genérica 
Modificar la clase Almacen<T> (ejercicio 1) para incluir un método adicional T obtenerMayor() 
que devuelva el elemento mayor en base a una comparación. Para esto, debemos asegurarnos de que el 
tipo T implemente la interfaz Comparable<T>. Probar con una lista de enteros y cadenas de texto para 
ver qué elementos son mayores. 

Ejercicio 4: Intercambiar Elementos en un Array Genérico 
Crear un método genérico estático intercambiar en una clase auxiliar que reciba un array genérico de 
tipo T y dos índices, e intercambie los elementos en esos índices. Probar el método con arrays de 
diferentes tipos, como Integer[] y String[]. 

Ejercicio 5: Almacen con Búsqueda Genérica 
Agregar a la clase Almacen<T> un método buscar(T elemento) que busque un elemento en el 
almacén. El método debe devolver el índice del elemento si lo encuentra, o -1 si no está en el almacén. 
Probar el método agregando varios elementos al almacén y buscando diferentes valores. 

Ejercicio 6: Contador de Elementos Repetidos 
Crear un método genérico contarRepeticiones(T[] array, T elemento) que reciba un 
array de tipo genérico y un elemento, y devuelva cuántas veces aparece ese elemento en el array. Probar 
con arrays de diferentes tipos como Integer[] y String[]. 

Ejercicio 7: Uso de ArrayList Genérico 
Crear una clase AlmacenList<T> que almacene elementos en un ArrayList<T> en lugar de un 
array. La clase debe tener métodos para agregar, obtener y eliminar elementos. Probar la clase con 
diferentes tipos de datos, como String e Integer. 

Ejercicio 8: Almacenamiento y Filtrado en ArrayList 
Modificar la clase AlmacenList<T> para que incluya un método 
filtrarPorCondicion(Predicate<T> condicion) que devuelva un ArrayList<T> con 
los elementos que cumplen una condición específica. Probar el método filtrando una lista de enteros para 
obtener solo los números mayores que 10. 

Ejercicio 9: Mapa Genérico con Clave-Valor 
Crear una clase AlmacenMapa<K, V> que use un HashMap<K, V> para almacenar elementos como 
pares clave-valor. La clase debe tener métodos para agregar, obtener y eliminar elementos por su clave. 
Probar la clase con diferentes tipos de clave y valor, como String y Integer. 

Ejercicio 10: Historial Genérico 
Implementar una clase genérica Historial<T> que permita almacenar un historial de elementos de 
cualquier tipo usando una colección de tipo ArrayList. La clase debe tener los siguientes métodos: 
1. agregar(T elemento): Este método permitirá agregar un elemento al historial. 
2. mostrarHistorial(): Este método imprimirá todos los elementos almacenados en el historial. 
3. borrarHistorial() (opcional): Método que vaciará el historial, eliminando todos los elementos. 
En la clase Main, crear un historial de navegación de tipo String y agregar varias URLs. Luego, mostrar el 
historial y borrar su contenido utilizando los métodos correspondientes. Finalmente, intentar mostrar el 
historial nuevamente para verificar que esté vacío.
