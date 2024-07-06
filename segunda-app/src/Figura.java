public abstract class Figura {
    //USAMOS PROTECTED PARA QUE SOLO SEA USADA POR SUBCLASES
    protected double x; //posicion x
    protected double y; //posicion y

    //SOLO SE DECLARA EL METODO
    public abstract double calcularArea();


    //CONSTRUCTOR solo sus SUBCLASES Lo usaran
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    } 

    

    

}
