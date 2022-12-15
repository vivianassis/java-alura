package defaults;

public class TesteContas {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(1337, 23334);

        conta.deposita(200.0);

        System.out.println(conta.getSaldo());

        conta.setAgencia(570);

        System.out.println(conta.getAgencia());

        System.out.println("o total de contas é : " + Conta.getTotal());


        ContaCorrente contaCorrente = new ContaCorrente(111,111);
        ContaPoupanca contaPoupanca = new ContaPoupanca(222,222);

        contaCorrente.deposita(100);
        System.out.println(contaCorrente.getSaldo());
        contaPoupanca.deposita(200);
        System.out.println(contaPoupanca.getSaldo());
        contaCorrente.transfere(100, contaPoupanca); //apesar de pedir um parametro 'Conta', graças ao uso do polimorfismo, podemos colocar algum parâmetro mais específico como uma conta-corrente ou poupança aqui que irá funcionar.
        System.out.println(contaCorrente.getSaldo());

        contaCorrente.saca(90);
        System.out.println(contaCorrente.getSaldo());

        ContaCorrente cc = new ContaCorrente(111,234);
        System.out.println("Teste nova localização método depósito");
        System.out.println(cc.getSaldo());
        cc.deposita(300);
        System.out.println(cc.getSaldo());
        }


}
