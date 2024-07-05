public class Sintexis {
    public static void main(String[] args) {
        System.out.println("Hola Mundo, estoy en VSC!");

    /*  VARIABLES Y ASIGNACION
        * Variables
            Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
        * DECLARACIÓN:
            Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
        * DEFINICIÓN:
            Asignar el tipo de dato y el nombre de la variable dándole o no un valor inicial
        * ASIGNACIÓN:
            Darle un valor a la variable ya declarada

            int numero0;
            numero0 = 5;

    */
        
    /*   TIPOS DE VARIABLES
            Variables primitivas: Almacenan valores básicos
            Variables de referencia: Almancena direcciones de memoria que apuntan a objetos
    */

    /*   TIPOS DE DATOS DE NUMEROS ENTEROS
            byte (-128 al 127)
            short (-32768 al 32767)
            int
            long

            int numero1 = 6;
            System.out.println("tipo de dato entero " + numero1);
    */

    /*   TIPOS DE DATOS DE NUMEROS DECIMALES
            float (6 decimales)  debes agregar si o si el f al final
            double

            double numeroDe = 6.679;
            float pi = 3.14f;
            float num = 6.67899f;
            System.out.println("tipo de dato flotante con double " + numeroDe + " con float " + pi + " " + num );
    */
      
    /*   TIPOS DE DATO CARACTER
            char 

            char letra = 'S';
            System.out.println("tipo de dato caracter " + letra);
    */

    /*    TIPOS DE DATO BOOLEANO
            boolean (true / false) 

            boolean v = true;
            boolean f = false;
            System.out.println("tipo de dato booleano " + v + " " + f);
    */

    /*    Tipo de DATO usando String y metodos
    
        String texto = "Hola amigo linuxero";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);
        
        char caracter = texto.charAt(3);
        System.out.println(caracter);

        String subString = texto.substring(5, longitud);
        System.out.println(subString);

        String minusculString = texto.toLowerCase();
        System.out.println(minusculString);

        String capString = texto.toUpperCase();
        System.out.println(capString);

        int indice  = texto.indexOf("linuxero");
        System.out.println(indice);

        String replaceString = texto.replace("linuxero","javaxero");
        System.out.println(replaceString);

        boolean contiene = texto.contains("amigo");
        System.out.println("Tine la palabra amigo?" + contiene);

        // para eliminar espacios antes y despues de terminar empezar las letras, no elimina lo de adentro
        String sinEspacioString = texto.trim();
        System.out.println(sinEspacioString);
    */
    
    // --------------------------------------------------------------------------------------------    
    /* OPERADORES
            simbolos que sirven para realiar operaciones con variables o valores
                * OPERADOR ARITMETICO
                    - Suma → a + b
                    - Resta → a - b
                    - Dividir → a / b (siempre poner un tipo de dato dobule en todos los participantes de la division)
                    - Producto → a * b
                    - Resto/Modulo de la division → a % b
                
                * OPERADOR ASIGNACION
                    =    //es el igual  *R es un numero real
                    c+=R
                    c-=R
                    c++
                    c--

                * OPERADOR COMPARADOR // devuelve un booleano
                    > mayor
                    < menor
                    >= mayor igual
                    <= menor igual
                    == igual
                
                * OPERADOR LOGICO
                && simboliza AND
                || simboliza OR
                !  es el negador

    */    

    // --------------------------------------------------------------------------------------------    
    /* CONDICIONALES 
        Tomar en cuenta que si hay rangos debes de usar && sino puede que este mal planteada y algunos casos no van a llegar
        
        * IF - ELSE
            if (edad > 18){
                System.out.println("Entraste")
            } else if (edad == 18){
                System.out.println("Por poco y no entras")
            } else {
                System.out.println("ANDA MIMI")
            }

        * SWITCH 
            bebida = "Café"

            if(bebida == "Café"){
                System.out.println("Buenisima elección");
            } else if (bebida == "Mate"){
                System.out.println("Debés ser Argentino, Uruguayo o Paraguayo! ¡Buen elección!");
            } else if (bebida == "Gaseosa"){
                System.out.println("Tené cuidado con el azúcar porque es mala para la salud");
            } else if (bebida == "Vino"){
                System.out.println("Si tomaste vino, no manejes por favor");
            } else {
                System.out.println("Disfrutá de tu bebida!");
            }

            
            switch (bebida) {
                case "Café":
                    System.out.println("Buenísima elección, de paso combina con el curso de Java de Sergie Code");
                    break;
                case "Mate":
                    System.out.println("Debés ser Argentino, Uruguayo o Paraguayo! ¡Buen elección!");
                    break;
                case "Gaseosa":
                    System.out.println("Tené cuidado con el azúcar porque es mala para la salud");
                    break;
                case "Vino":
                    System.out.println("Si tomaste vino no manejes, por favor");
                    break;
                default:
                    System.out.println("Disfrutá de tu bebida!");
                    break;
            }


    */
    
    // --------------------------------------------------------------------------------------------    
    /* CICLOS
        BUCLE FOR //sabes cuantas interaciones deben hacerse
            for(inicializacion; condicion; actualizacion)

            for(int i = 1; i<=10 ; i++){
                System.out.println(i);
            }

        BUCLE WHILE // no sabes cuantas interacciones necesitas pero tienes una condicion para romperlo
            while (condicion)

            int contador = 0;
            while(contador<4){
                System.out.println(contador);
                contador++;
            }

        BUCLE DO-WHILE //se ejecuta al menos una vez, primero hace una iteracion y luego se vuelve igual a un ciclo while
            do {
            instrucciones
            }while(condicion)

    */

    // --------------------------------------------------------------------------------------------    
    /* CONTROLES DE FLUJO
            continue: obliga a que pase a la siguiente interaccion

            break: corta el ciclo directamente

            return: devuelve un valor y sale de la FUNCION

    */

    // --------------------------------------------------------------------------------------------    
    /* ARREGLOS
        Estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre, se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice
     
        int[] numeros = new int[5]; //5 posiciones, va del 0 al 4
        numeros[0] = 1;
        numeros[1]= 2;
        //numeros[2] = 3; SI NO LE ASIGNE, LE ASIGNA 0, en otros lenguajes es null
        numeros[3]= 4;
        numeros[4] = 5;
        System.out.println(numeros); //mostrara cada uno 
        System.out.println(numeros.length); //mostrara la longitud

        numeros = {0,10,22,33,45}
        forEach
        for (int numero : numeros){
            System.out.println(numero)
        }
    */

        
    }
}

