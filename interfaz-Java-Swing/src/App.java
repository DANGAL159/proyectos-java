import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        MyFrame myFrame = new MyFrame(); //that lets you modified propities if you wont mod anything then just use new MyFrame();

        JLabel label1 = new JLabel(); // create a Label

        //Set a text in a Label
        label1.setText("HELLO WORLD");

/*        //Cargar la imagen
        ImageIcon imageIcon = new ImageIcon("src\\pixelcat.jpeg");
        label1.setIcon(imageIcon);
        
        //Set text TOP, CENTER, BOTTOM of imageicon
        label1.setVerticalTextPosition(JLabel.TOP);

        //Set text LEFT, CENTER, RIGHT of imageicon
        label1.setHorizontalTextPosition(JLabel.RIGHT);
*/

        //Set a color for the font
        label1.setForeground(Color.BLUE);

        //Set a font
        //label1.setFont(new Font("MV Boli",Font.PLAIN,20));
        

        //Add a Label in a Frame
        myFrame.add(label1);
        label1.setVisible(true);


    }
}
