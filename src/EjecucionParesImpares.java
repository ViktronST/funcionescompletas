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
        System.out.println("-------------------------");
        ClaseParesImpares.getNumerosPares(inicio, fin);
        ClaseParesImpares.getNumerosImpares(inicio, fin);
        System.out.println("-------------------------");
        ClaseParesImpares.getRangoNumeros(inicio, fin, true);
        ClaseParesImpares.getRangoNumeros(inicio, fin, false);

        //PODEMOS AHCER QUE LA CLASE main NO SEPA QUE TENEMOS ESTE MÉTODO.
        //SIMPLEMENTE QUE SEA UNA HERRAMIENTA INTERNA DE LA CLASE PARES IMPARES.

        teclado.close();
    }
}
