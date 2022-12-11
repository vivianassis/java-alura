package colaborador;

public class Funcionario {
    private String nome;
    private String cpf;
    /*protected*/private double salario; //protected quer dizer 'PUBLICO SÓ PARA OS MÉTODOS FILHOS', mas é melhor manter todos os atributos privados e usar os métodos getters e setters para manipulá-los

    private final double bonificacao = salario;

    private static int matricula;

    //criar construtor (mesmo nome da classe, sem tipo de retorno ['visibilidade + nome' direto])
    /*public funcionario.Funcionario(String nome, String cpf, double salario){
        System.out.println("Informações do funcionário: ");
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        matricula++;
        System.out.println("Nome: "+getNome());
        //System.out.println("Matrícula: "+getMatricula()); **((não é bom esconder chamadas a métodos do main))
        System.out.println("CPF: "+getCpf());
        System.out.println("Salário: "+getSalario());
        //System.out.println("Bônus: "+getBonificacao(0.1)); **((o mesmo caso de acima))
    }*/



    //criar métodos
    public double getBonificacao(){
        return this.salario *0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getMatricula() {
        return matricula;
    }
}
