package graficos;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);  //Tenemos que llamar a la herencia para que el metodo funcione al 100
        g.drawString("Estamos aprendiendo SWING", 100, 100);
    }

}
