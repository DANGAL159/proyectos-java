import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    //Jframe = a GUI windows to add components on it
    
    MyFrame(){
        //Set title of Frame
        this.setTitle("Jframe title goes here");

        //set width, height dimention 
        this.setSize(420, 420);

        //Make frame visible
        this.setVisible(true);

        //EXIT out of application, by default is in HIDE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //You can set HIDE/DO NOTHING when someone clicks in the X button.

        //Prevent Frame to be Resizabled
        this.setResizable(false);

        //Change the icon of the frame
        ImageIcon image = new ImageIcon("planeta.png"); //Create an ImageICon
        this.setIconImage(image.getImage());

        //Change background color
        this.getContentPane().setBackground(Color.GREEN); //with include colors
        this.getContentPane().setBackground(new Color(157,244,16)); //with rgb color or hex
    }
        
}
