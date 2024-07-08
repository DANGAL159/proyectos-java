package graficos;
import javax.swing.JFrame;

public class MarcoConDibujos extends JFrame{

    public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConFiguras milamina = new LaminaConFiguras();//Aqui usamos Graphics
        add(milamina);

        LaminaConFiguras2 milamina2 = new LaminaConFiguras2(); //Aqui usamos Graphics2D
        add(milamina2);


    }
}
