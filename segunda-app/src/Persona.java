public class Persona {

    //Atributos de la clase
    String nombre;
    String apellido;
    int edad;    
    Carrera carrera;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
    }

    //UTILIZANDO SOBRECARGA DE CONSTRUCTORES
    public Persona(String nombre, String apellido, int edad, String nombreCarrera){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera = new Carrera(nombreCarrera);
    }

    //Metodos
    public String darNombreCompleto(){
        return "SOY " + nombre + " " + apellido;
    }

    public String enviarSaludo(String saludado){
        return "Hola, " + saludado + " soy " + nombre;
    }

    public String mostrarInfo(){
        return "Hola soy " + nombre + " " + apellido + " y mi carrera es " + carrera.nombre ;
    }
    
}
