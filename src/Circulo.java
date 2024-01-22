
public class Circulo {

private double radio;
private double area;


    public Circulo(double radio, double area) {
        this.radio = radio;
        this.area = area;

        if (radio < 0){
            this.radio = 0;
        }
        else{
            this.radio =radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;

        if (radio < 0){
            this.radio = 0;
        }
        else{
            this.radio =radio;
        }
    }

    public double getArea() {
        return radio * radio * Math.PI;

    }

    public void setArea(double area) {
        this.area = area;

    }


    }

