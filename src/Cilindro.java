public class Cilindro extends Circulo {

private double altura;
private double volumen;
private double area;

    public double getAltura() {
        return altura;
    }

    public Cilindro(double radio, double area, double altura, double volumen) {
        super(radio, area);
        this.altura = altura;
        this.volumen = volumen;

    }


    public double getVolumen() {
        return getArea() * altura;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;

    }


    public void setAltura(double altura) {
        this.altura = altura;

        if (altura < 0){
            this.altura = 0;
        }
        else{
            this.altura =altura;
        }

    }

}

