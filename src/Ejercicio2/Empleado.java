package Ejercicio2;

public abstract class Empleado {

    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println(calcularSalario());
    }


}
