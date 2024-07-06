public class Carrera {
    //atributos
    String nombre;
    int duracion;
    boolean estaEnCurso;

    //constructor
    public Carrera(String nombre, int duracion, boolean estaEnCurso){
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaEnCurso = estaEnCurso;
    }

    ////UTILIZANDO SOBRECARGA DE CONSTRUCTORES
    public Carrera(String nombre){
        this.nombre = nombre;
    }
}
