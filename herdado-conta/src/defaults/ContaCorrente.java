package defaults;

//extends herda tudo da classe mãe, menos os construtores, que precisam ser invocados/criados, mas atenção:
public class ContaCorrente extends Conta{

    //public ContaCorrente(){}         -- O Java chama o construtor padrão, que não existe.

    //Pelo fato da classe mãe 'Conta' ter um construtor específico criado, precisamos dizer aqui em Conta
    //Corrente que este é o contrutor que queremos chamar, assim:

    public ContaCorrente(int agencia, int numero){

        super(agencia, numero);

    }

}
