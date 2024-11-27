package Ejercicio2;

public class ClasePrueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente(2500000);
        gerente.mostrarDetalles();

        System.out.println();

        Empleado vendedor = new Vendedor(1500000);
        vendedor.mostrarDetalles();
    }
}
