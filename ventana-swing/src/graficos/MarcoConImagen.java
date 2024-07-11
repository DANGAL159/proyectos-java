package graficos;

import javax.swing.JFrame;

public class MarcoConImagen extends JFrame{

    public MarcoConImagen(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConImagen miLamina =  new LaminaConImagen();
        add(miLamina);

    }

}
