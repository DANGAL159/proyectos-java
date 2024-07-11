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



    }

    //Creo una variable de tipo Imagen
    private Image imagen;


}
