package defaults;

public class ContaPoupanca extends Conta{

    //construtor que chama o construtor da classe 'Conta'
        public ContaPoupanca(int agencia, int numero){
            super(agencia, numero);
        }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    ;

}

