package Ejercicio1;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println(calcularArea());
    }
}