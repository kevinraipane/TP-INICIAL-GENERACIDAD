public class Par<T,U>{
    private T primero;
    private U segundo;

    public Par(T primero,U segundo){
        this.primero = primero;
        this.segundo = segundo;
    }

    //Metodo para obtener el primer elemento
    public T obtenerPrimero(){
        return primero;
    }

    //Metodo para obtener el segundo elemento
    public U obtenerSegundo(){
        return  segundo;
    }


}
