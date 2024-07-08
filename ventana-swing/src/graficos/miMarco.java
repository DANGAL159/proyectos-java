package graficos;

//import java.awt.Frame;

import javax.swing.JFrame;

public class miMarco extends JFrame {
    //PUEDES USAR EL THIS pero es opcional
    public miMarco(){

        this.setSize(500, 500); 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Marco centrado con null y no reajustable");

        setLocationRelativeTo(null); //Centro la ventana con null, si quiero puedo poner un x,y especifico(eje invertido en y)

        //setBounds(Pos-x, Pos-y, WIDTH, HEIGHT); combina el setSize y setLocationRelativeTo

        setResizable(false);

        //setExtendedState(Frame.MAXIMIZED_BOTH); //Hace que la ventana tome todo el tamaño posible

    }

}
