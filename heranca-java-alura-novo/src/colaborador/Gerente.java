package colaborador;

//Funcionario. Gerente é um Funcionário / funcionario autenticável. Gerente herda da classe Funcionário
public class Gerente extends FuncionarioAutenticavel {
    //criar métodos específicos da classe funcionario. Gerente, que serão:
    public double getBonificacao(){
        return /*(super.getBonificacao())*/ + super.getSalario(); //'super.' = atributo declarado na classe Super /classe mãe / classe base
    } // ou seja, por exemplo, o super.getBonificação é o da classe Funcionário e o getBonificação é o da classe Gerente

}