public class TestaCondicional2 {
    //operador OU || e E &&

    public static void main(String[] args) {
        int idade = 16;
        int quantidadeDePessoas = 3;
        boolean acompanhado = quantidadeDePessoas > 1;

        if (idade >= 18 && acompanhado){
            System.out.println("Seja bem vindo, pode entrar.");
        }
        else {
            System.out.println("Infelizmente, você não pode entrar.");
        }
    }
}
