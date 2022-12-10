public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(200));
         //System.out.println(conta.saldo); - não funciona mais pois privamos o saldo, então usaremos o método
        System.out.println(conta.getSaldo());

        //proibido
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);

        //para impedir de se usar os atributos e incentivar uso dos metodos, usamos a palavra private no atributo
        // assim ele só poderá ser alterado dentro da própria classe.

    }
}
