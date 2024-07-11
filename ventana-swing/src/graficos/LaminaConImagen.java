package graficos;

import javax.swing.JPanel;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class LaminaConImagen extends JPanel{

    public void paintComponent(Graphics g){

        super.paintComponent(getGraphics());

        File miImagen = new File("ventana-swing\\src\\imagenes\\pixelcat.jpeg");

        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            System.out.println("IMAGEN NO ENCONTRADA");
        }
        
        g.drawImage(imagen, 5, 5, null); // imagen, posX, posY, observador(quien revisa la imagen) = null

        //El metodo g. copyArea() el cual nos permite crear una copia de nuestra imagen en caso que querramos hacer un mosaico o alguna forma de mostrar imagenes en varios sitios, usa de parametros (posX,posY,ancho,alto, posX a copiar, posY a copiar), utilizarias ciclos 
        //En caso de no saber el tamaño de tu imagen utilizar .getHeight y gettWidth, y piden el objeto que espera que la imagen sea cargada y es la lamina, asi que usaras  this


    }

    //Creo una variable de tipo Imagen
    private Image imagen;


}
