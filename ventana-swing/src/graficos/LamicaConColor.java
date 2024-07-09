package graficos;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JPanel;

public class LamicaConColor extends JPanel {
//Puedes usar un .brighter /darker para cambiar la iluminacion
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        //Dibujo un rectangulo
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); //posX,posY,ancho,alto
        g2.setPaint(Color.black);
        g2.draw(rectangulo);
        g2.setPaint(Color.GREEN);
        g2.fill(rectangulo);

        //dibujar elipse
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangulo);
        g2.setPaint(new Color(125,155,255)); //rgb
        //g2.setPaint(new Color(125,155,255,0)); rgba 
        g2.fill(ellipse);
        g2.setPaint(Color.black);
        g2.draw(ellipse);


        //Para establecer un color en el panel
        //setBackground(Color.CYAN); //puedes usar  SystemColor.Windows y toma el color que usa windows usado en ese PC

    }

}
