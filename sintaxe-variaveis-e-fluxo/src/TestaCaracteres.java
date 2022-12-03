public class TestaCaracteres {
    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 66; //B
        System.out.println(valor + 1);

        valor = (char) (valor + 1); //C
        System.out.println(valor);

        //String não é uma variável.
        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);
        //String concatena dados diversos pra String
        palavra = palavra + 2020;
        System.out.println(palavra);



    }
}
