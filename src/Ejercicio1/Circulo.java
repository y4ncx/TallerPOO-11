package Ejercicio1;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
     public double calcularArea(){
        System.out.println("El area del circulo es = ");
        return Math.PI * (radio * radio);
    }
}
