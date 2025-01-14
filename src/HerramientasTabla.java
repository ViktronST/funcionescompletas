public class HerramientasTabla {

    private static void mostrarTablaMultiplicarX(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }

    private static void mostrarTablaMultiplicarAsterisco(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }

        // for(int i = 1; i <= 10; i++) {
        //     int resultado = numero * i;
        //     String operacion = numero + " * " + i;
        //     System.out.println(operacion + " = " + resultado);
        // }
    }

    private static void mostrarTablaMultiplicarPor(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " por " + i + " = " + numero * i);
        }
    }

    public static void mostrarTablaMultiplicar(int numero, String tipo) {
        switch (tipo) {
            case "x":
                mostrarTablaMultiplicarX(numero);
                break;
            case "*":
                mostrarTablaMultiplicarAsterisco(numero);
                break;
            case "por":
                mostrarTablaMultiplicarPor(numero);
                break;
            default:
                System.out.println("Vuelve a intentarlo con un tipo válido (x, *, por)");
        }
    }
}
