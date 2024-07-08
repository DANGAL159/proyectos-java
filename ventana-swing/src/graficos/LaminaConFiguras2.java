package graficos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

public class LaminaConFiguras2 extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g; //Aqui hago una refactorizacion, para que g pase de ser un Graphics pase a un Graphics2D gracias a que es una clase hija de Graphics, con g2.draw ya puedo dibujar los objetos

        //Creo un rectangulo con su constructor
        Rectangle2D rectangulo = new Rectangle2D.Double(200,200,200,150); //(posX,posY,ancho,largo)
        g2.draw(rectangulo);

        //Creo una elipse con su constructor y hago que este contenida en el rectangulo
        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangulo);
        g2.draw(ellipse);

        //aqui solo cree una linea
        g2.draw(new Line2D.Double(200,200,400,350));//(posX0,posY0,posX1,posY1)

        //obtuve solo un punto a traves del rectangulo y fije un radio
        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        //double radioPersonalizado = 150; con este hariamos cualquier circulo 

        double radioReal = Math.sqrt(Math.pow(150/2, 2)+Math.pow(200/2, 2));//Vamos a hacer que englobe justo al rectangulo
        //System.out.println("Centro en X " + CentroenX + " Centro en Y " + CentroenY + " Radio " + radioReal );
        //Con esos datos obtenidos cree una elipse que fuese un circulo, ya que un circulo es el caso especial de la elipse
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radioReal, CentroenY+radioReal);
        g2.draw(circulo);
    }

}
