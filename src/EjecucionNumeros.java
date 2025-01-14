import java.util.Scanner;

public class EjecucionNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa Collatz");
        System.out.print("Ingrese un número: ");
        String entrada = teclado.nextLine();
        int numero = Integer.parseInt(entrada);
        System.out.println("-------------------------");
        HerramientasNumeros.mostrarCollatz(numero);
        System.out.println("-------------------------");
        
        teclado.close();
    }
}
