public class Animal {
    String nombre;
    int edad;
    static int contadorAnimales = 0;  //si lo pones private igual se puede acceder usando un getter
    
    //constructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    //Metodos
    public String hacerSonido(){
        return "HRASDA";
    }

    public void mostrarNombreEdad(){
        System.out.println("Me llamo "+nombre + " y tengo " + edad + " años");
    }

    //METODO USANDO STATIC
    public static int getCantidadAnimales(){
        return contadorAnimales;
    }
    
}
