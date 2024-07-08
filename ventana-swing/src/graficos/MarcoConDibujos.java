package graficos;
import javax.swing.JFrame;

public class MarcoConDibujos extends JFrame{

    public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConFiguras milamina = new LaminaConFiguras();

        add(milamina);
    }
}
