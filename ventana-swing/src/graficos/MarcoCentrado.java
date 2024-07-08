package graficos;
import java.awt.*;
import javax.swing.*;

public class MarcoCentrado extends JFrame{
    //USAREMOS LA CLASE TOOLKIT

    public MarcoCentrado(){

        Toolkit mipantalla = Toolkit.getDefaultToolkit();  //Se comunica con el SO y con ello consigue info de la pantalla usada

        Dimension tamanoPantalla = mipantalla.getScreenSize(); //Obtuvimos ya la dimension 1900x1800 o la que tenga la pantalla

        int alturaPantalla = tamanoPantalla.height; //con el .height accedemos al atributo height de tamanoPantalla
        int anchoPantalla = tamanoPantalla.width; //con el .height accedemos al atributo width de tamanoPantalla

        setSize(anchoPantalla/2 , alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4); //Centrar el frame usando matematica, para que empiece en el final del primer cuadrado al dividir en 16 partes la pantalla

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Marco Centrado manual");

        //Fijar una imagen en el icono de nuestra ventana, SIEMPRE HACERLO ASI
        Image miIcono = mipantalla.getImage("ventana-swing\\src\\imagenes\\pixelcat.jpeg");
        setIconImage(miIcono);
        



    }
}
