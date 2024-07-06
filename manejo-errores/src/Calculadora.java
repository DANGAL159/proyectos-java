import Exceptions.DividirPorCeroException;

public class Calculadora {

//USAREMOS throws   que es para que lanze el error que nosotros ya controlamos en nuestra clase del paquete Exceptions

    public int dividir(int dividendo, int divisor) throws DividirPorCeroException{
        if(divisor == 0){
            throw new DividirPorCeroException();
        }

        return dividendo/divisor;
    }


}
