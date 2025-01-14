import java.util.Scanner;

public class EjecucionTabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        int numero = teclado.nextInt();
        System.out.print("Introduce el tipo de tabla (x, *, por): ");
        String tipo = teclado.next();
        HerramientasTabla.mostrarTablaMultiplicar(numero, tipo);

        teclado.close();
    }
}
