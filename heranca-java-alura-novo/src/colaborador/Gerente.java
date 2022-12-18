package colaborador;

//Funcionario. Gerente é um Funcionário / Gerente herda da classe Funcionário
//e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    //Criar métodos específicos da classe funcionario. Gerente, que serão:
    public double getBonificacao(){
        return /*(super.getBonificacao())*/ + super.getSalario(); //'super.' = atributo
        // declarado na classe Super / mãe / classe base
    } // ou seja, por exemplo, o super.getBonificação é o da classe Funcionário e

    //criar métodos concretos para as abstrações da 'interface' Autenticável:
    private AutenticacaoUtil autenticador;

    //Composição usa classe com o código repetido escrito dentro dela, chamando-os nos locais
    //onde ele será usado (através do construtor, e do corpo dos métodos)

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}