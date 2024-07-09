package graficos;
public class CreandoMarcos {
    public static void main(String[] args) throws Exception {

        miMarco v1 = new miMarco();// con titulo y centrado con null
        v1.setVisible(false);

        MarcoCentrado v2 = new MarcoCentrado(); //Con icono, titulo y centrado con matematicas
        v2.setVisible(false);

        MarcoConTexto v3 = new MarcoConTexto(); // Con esta solo añadi un texto con Lamina, metodo drawString
        v3.setVisible(false);

        MarcoConDibujos v4 = new MarcoConDibujos(); //Usamos Graphics y Graphics2D
        v4.setVisible(false);

        MarcoConColor v5 = new MarcoConColor();
        v5.setVisible(true);



    }

}
 
