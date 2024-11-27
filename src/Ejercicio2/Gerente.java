package Ejercicio2;

public class Gerente extends Empleado{
    private double salarioGerente;


    public Gerente(double salarioGerente){
        this.salarioGerente = salarioGerente;
    }

    @Override
    public double calcularSalario(){
        System.out.println("El salario del gerente es de =");
        return salarioGerente;
    }


}
