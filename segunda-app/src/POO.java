public class POO {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Sin contructor en clase Persona ni en clase Carrera
        Persona persona1 = new Persona();
        persona1.nombre = "Daniel";
        persona1.apellido = "Gal";
        persona1.edad = 60;
        
        Carrera carrera1 = new Carrera();
        carrera1.nombre = "Ingenieria en ciencias y sistemas";
        carrera1.duracion = 6;
        carrera1.estaEnCurso = false;

        persona1.carrera = carrera1;

        System.out.println("Nombre: " + persona1.nombre + " Apellido: " + persona1.apellido + " Edad: " + persona1.edad);
        System.out.println(persona1.darNombreCompleto());
        System.out.println(persona1.enviarSaludo("Copito"));
        System.out.println("Estudie " + persona1.carrera.nombre + " durante " + persona1.carrera.duracion + " años");
        */

    /* 

        //Realizado con un constructor 
        Persona persona2 = new Persona("Pedro","Pascal", 48, "Mandaloriano",20,true);
        System.out.println(persona2.darNombreCompleto());
        System.out.println(persona2.mostrarInfo());
        //Constructor sobrecargado
        Persona persona3 = new Persona("Andres","Gue",70,"ingenieria en alimentos");
        System.out.println(persona3.mostrarInfo());

    */

    /* Realizado con ENCAPSULAMIENTO
        Personon personon1 = new Personon("Danonino", "Chocolatoso", 25);
        personon1.setNombre("bananino");
        System.out.println(personon1.mostrarInfo());
    */

    
        Animal animal = new Animal("Bestia",200);
        Gato gato = new Gato("Coposo", 15);
        Perro perro = new Perro("Firulais", 3);

        System.out.println("El animal " + animal.nombre + " hace:");
        System.out.println(animal.hacerSonido());
        System.out.println("El gato " + gato.nombre + " hace:");
        System.out.println(gato.hacerSonido());
        System.out.println("El perro " + perro.nombre + " hace:");
        System.out.println(perro.hacerSonido());
        gato.mostrarNombreEdad();
        //PARA USAR UN ATRIBUTO Y METODO DE CLASE debe ser llamado con el nombre de la clase
        System.out.println("Total animales creados: " + Animal.getCantidadAnimales());









    }
}
