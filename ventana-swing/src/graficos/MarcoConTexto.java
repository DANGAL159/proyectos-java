package graficos;
import javax.swing.JFrame;

public class MarcoConTexto extends JFrame{

    public MarcoConTexto(){
        setSize(600,450);
        setLocationRelativeTo(null);
        setTitle("Primer Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Lamina milamina = new Lamina();
        add(milamina);
    }

}
