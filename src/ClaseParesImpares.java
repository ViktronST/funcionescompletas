public class ClaseParesImpares {
    
    public static void getNumerosPares(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
    }

    public static void getNumerosImpares(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println("Impar: " + i);
            }
        }
    }

    public static void getRangoNumeros(int inicio, int fin, boolean pares){
        if(pares == true){
            getNumerosPares(inicio, fin);
        }else{
            getNumerosImpares(inicio, fin);
        }
    }
}
