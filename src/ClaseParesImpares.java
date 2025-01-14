public class ClaseParesImpares {
    
    public static void getNumerosPares(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
    }


}
