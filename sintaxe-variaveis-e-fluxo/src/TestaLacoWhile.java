public class TestaLacoWhile {
    public static void main(String[] args) {
        int numero = 0;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        //Soma progressiva (1+2+3+4+5..)
        int numero2 = 0;
        int total2 = 0;
        while (numero2 <= 10) {
            total2 = total2 + numero2;
            System.out.println(total2);
            numero2++;
        }
    }
}
