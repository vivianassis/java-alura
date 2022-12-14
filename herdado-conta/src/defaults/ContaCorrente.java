package defaults;

//extends herda tudo da classe mãe, menos os construtores, que precisam ser invocados/criados, mas atenção:
public class ContaCorrente extends Conta implements Tributavel{

    //public ContaCorrente(){}         -- O Java chama o construtor padrão, que não existe.

    //Pelo fato da classe mãe 'Conta' ter um construtor específico criado, precisamos dizer aqui em Conta
    //Corrente que este é o contrutor que queremos chamar, assim:

    public ContaCorrente(int agencia, int numero) {

        super(agencia, numero);

    }

    @Override
    public void deposita(double valor){
        super.saldo +=valor;
}

    //escrevendo saca+enter, ele entende que se quer sobrescrever o método 'saca' da classe mãe 'Conta'
    @Override  //anotação do Java para sobreescrever o método
    public boolean saca(double valor) {
        return super.saca(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo()*0.01;
    }
}
