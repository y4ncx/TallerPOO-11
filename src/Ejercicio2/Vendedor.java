package Ejercicio2;

public class Vendedor extends Empleado{
    private double salariovendedor;

    public Vendedor(double salariovendedor){
        this.salariovendedor = salariovendedor;
    }

    @Override
    public double calcularSalario(){
        System.out.println("El salario del vendedor es de = ");
        return salariovendedor;
    }


}
