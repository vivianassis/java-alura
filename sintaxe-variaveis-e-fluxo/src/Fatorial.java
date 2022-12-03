public class Fatorial {
    public static void main(String[] args) {


                int fatorial = 1;
                for (int i = 1; i < 11; i++) {
                    fatorial *= i;
                    //enquanto i for menor que 11, fatorial vai receber o valor dele(começando por 1)
                    // vezes(*=) o que estará sendo incrementado no i
                    System.out.println("Fatorial de " + i + " = " + fatorial);
                }
            }

    }

