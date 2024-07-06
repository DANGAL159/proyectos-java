public class Circulo extends Figura{
    private double radio;


    protected Circulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) { 
        this.radio = radio;
    }


    
}
