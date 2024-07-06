import Exceptions.DividirPorCeroException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* PURO TRY-CATCH
        int numero1 = 5;
        int numero2 = 0;
        double resultado;

        try {
            //intenta hacer esta parte del codigo
            resultado = numero1/numero2;
            System.out.println(resultado);
        } catch (Exception e) {
            //si no puede por algun error, entonces ejecuta esta parte del codigo
            e.printStackTrace();
            System.out.println("Esto va despues de la excepcion");
        }
        System.out.println("Fuera del try-catch");

        */

        int num1 = 10;
        int num2 = 0;
        double resultado;

        Calculadora calculadora1 = new Calculadora();
        
        try {
            resultado = calculadora1.dividir(num1, num2);
            System.out.println(resultado);
        } catch (DividirPorCeroException e) {
            e.printStackTrace();
            System.out.println("Esto va despues de la excepcion");
        }finally {  //EL finally sale al final del todo sin importar que pase
            System.out.println("HEMOS FINALIZADO EL CALCULO");
        }

    }
}
