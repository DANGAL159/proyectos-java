package graficos;

import java.awt.Color;

import javax.swing.JFrame;

public class MarcoConFuentes extends JFrame{

    public MarcoConFuentes(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(false);
        
        setTitle("Prueba de Fuentes");
        setSize(500, 500);
        this.setLocationRelativeTo(null);

        LaminaConFuentes milamina = new LaminaConFuentes();
        add(milamina);

        milamina.setForeground(Color.BLUE); //este metodo quitara el color que definimos en la lamina y lo dejara todo en un solo color que definas es esta instruccion
    }

}
