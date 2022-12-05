public class TestaMetodo {

    public static void main(String[] args) {

        Conta matheus = new Conta();
        matheus.saldo = 5030;

        //invocando os metodos criados na classe
        matheus.deposita(100.0);
        System.out.println(matheus.saldo); //330.0
        boolean conseguiuRetirar = matheus.saca(20);
        System.out.println(matheus.saldo);
        System.out.println(conseguiuRetirar);

        //entre contas
        Conta marcela = new Conta();
        marcela.deposita(1000);
        marcela.transfere(300, matheus);

        //retorno do banco
        if (marcela.transfere(400, matheus)){
            System.out.println("Transferência feita com sucesso!");
        }else {
            System.out.println("Saldo insuficiente, recarregue e tente novamente!");
        }
    }
}
