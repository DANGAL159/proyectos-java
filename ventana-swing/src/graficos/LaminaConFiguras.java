package graficos;

import java.awt.Graphics;

import javax.swing.JPanel;

public class LaminaConFiguras extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawRect(50, 50, 200, 200); // dibuja un rectangulo a 50px de Alto Ancho de la lamina
        //existen varios mas con draw[nombreDeLaFigura]

    }

}
