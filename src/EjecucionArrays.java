import java.util.Scanner;

public class EjecucionArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres sumar?");
        int cantidad = scan.nextInt();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número " + (i + 1));
            numeros[i] = scan.nextInt();
        }
        System.out.println("La suma de los números es: " + JuegoArrays.sumarNumerosArray(numeros));
    }
}
