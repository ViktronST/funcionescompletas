import java.util.Scanner;

public class EjecucionParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa Pares e Impares");
        System.out.print("Ingrese el número de inicio: ");
        String entrada = teclado.nextLine();
        int inicio = Integer.parseInt(entrada);
        System.out.print("Ingrese el número de fin: ");
        entrada = teclado.nextLine();
        int fin = Integer.parseInt(entrada);
        ClaseParesImpares.getNumerosPares(inicio, fin);
    }
}
