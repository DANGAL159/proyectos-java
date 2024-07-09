package graficos;

import javax.swing.JFrame;

public class MarcoConColor extends JFrame{

    public MarcoConColor(){
        setTitle("Marco con Colores");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LamicaConColor milLamicaConColor = new LamicaConColor();
        add(milLamicaConColor);

    }
}
