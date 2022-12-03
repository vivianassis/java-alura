public class MultiplosDeTres {
    public static void main(String[] args) {
        for (int multiplo = 3 ; multiplo <= 100 ; multiplo++) {
            if (multiplo % 3 == 0) {
                System.out.print(" " + multiplo);
            }
        }
        System.out.println();
        int numero = 3;
        while (numero <=100){
            System.out.print(" " + numero);
            numero += 3;
        }
    }
}
