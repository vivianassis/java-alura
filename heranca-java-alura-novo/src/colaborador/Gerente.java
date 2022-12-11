package colaborador;

//Funcionario. Gerente é um Funcionário / funcionario. Gerente herda da classe Funcionário
public class Gerente extends Funcionario {
    //Atributo específico da classe funcionario.Gerente
    private int senha;

    //criar métodos específicos da classe funcionario. Gerente, que serão 2
    public double getBonificacao(){
        return (super.getBonificacao()) + super.getSalario(); //'super.' = atributo declarado na classe Super /classe mãe / classe base
    } // ou seja, por exemplo, o super.getBonificação é o da classe Funcionário e o getBonificação é o da classe Gerente
    public boolean autenticaGerente(int senha){
        return this.senha == senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
}