package graficos;

import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class LaminaConFuentes extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Font mifuente = new FontUIResource("Arial", Font.BOLD, 26); //Name[String], Style , Size
        g2.setFont(mifuente);
        g2.setColor(Color.BLUE);
        g2.drawString("HOLA", 100, 100);

        g2.setFont(new Font("Arial",Font.ITALIC,14));
        g2.setColor(new Color(128,90,60));
        g2.drawString("ADIOS", 300, 100);

    }

}
