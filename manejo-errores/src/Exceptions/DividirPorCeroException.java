package Exceptions;

//HEREDA DE LA CLASE Exception que es algo nativo de JAVA
public class DividirPorCeroException extends Exception {

    @Override
    public String getMessage(){
        return "NO se puede dividir por 0";
    }

    //PARA HACERLO DINAMICO PUEDES HACER QUE LOS MENSAJES SEAN PERSONALIZADOS USANDO IF EN CALCULADORA Y AQUI UN ATRIBUTO STRING DONDE DEFINAS QUE TIPo DE ERRORES TE ESTA DANDO 
}
