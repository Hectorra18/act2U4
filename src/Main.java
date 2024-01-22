public class Main {
    public static void main(String[] args) {


        Circulo circulo = new Circulo(30, 0);
        Cilindro cilindro = new Cilindro(10, 48, 248,0);


        System.out.println("El radio del circulo es: " + circulo.getRadio());
        System.out.println("El area del circulo es: " + circulo.getArea());

        System.out.println("El radio del cilindro es: " + cilindro.getRadio());
        System.out.println("La altura del cilindro es: " + cilindro.getAltura());
        System.out.println("El area del cilindro es: " + cilindro.getArea());
        System.out.println("El volumen del cilindro es: " + cilindro.getVolumen());




        }
    }
