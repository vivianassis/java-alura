public class TestesComIf {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int quantidadePessoas = 1;
        int idade = 16;

        if (idade >= 18) {
            System.out.println("Você tem mais que 18 anos.");
            System.out.println("Bem vindo!");
        } else if (quantidadePessoas >= 2) {
            System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado.");
        } else {
            System.out.println("Infelizmente, você não pode entrar");
        }
    }
}
