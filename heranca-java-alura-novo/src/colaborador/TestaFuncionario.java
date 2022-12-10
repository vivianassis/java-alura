package colaborador;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario maria = new Funcionario();
        //podemos retirar todas essas linhas abaixo, de todas as inicializações, mudando apenas o construtor
        maria.setNome("Maria Santana");
        maria.setCpf("089.486.498-09");
        maria.setSalario(2000);
        maria.getBonificacao();
        System.out.println("Nome: " + maria.getNome());
        System.out.println("CPF: " + maria.getCpf());
        System.out.println("Salário: " + maria.getSalario());
        System.out.println("Bônus: " + maria.getBonificacao());
        System.out.println("Matrícula: " + Funcionario.getMatricula());

        /*funcionario.Funcionario jose = new funcionario.Funcionario("José Rodrigues", "085.432.431-43",2300);
        System.out.println("Bônus: "+jose.getBonificacao());
        System.out.println("Matrícula: "+funcionario.Funcionario.getMatricula());
    }*/
    }
}
