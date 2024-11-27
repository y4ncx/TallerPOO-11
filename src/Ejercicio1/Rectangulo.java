package Ejercicio1;

public class Rectangulo extends Figura{
    private int altura;
    private int base;

    public Rectangulo(int largo, int ancho){
        this.altura = largo;
        this.base = ancho;
    }

    @Override
    public double calcularArea(){
        System.out.println("El area del rectangulo es = ");
        return altura * base;
    }
}
