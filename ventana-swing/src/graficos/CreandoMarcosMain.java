package graficos;
public class CreandoMarcosMain {
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
        v5.setVisible(false);

        MarcoConFuentes v6 = new MarcoConFuentes();
        v6.setVisible(false);

        //Para obtener las fuentes se hace el siguiente codigo
        /*
    // import java.awt.GraphicsEnvironment; //NECESARIo
    String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    for(String nombredelafuente : nombreDeFuentes){
        System.out.println(nombredelafuente);
    }
         */

        MarcoConImagen v7 = new MarcoConImagen();
        v7.setVisible(true);
         
    }

}
 
