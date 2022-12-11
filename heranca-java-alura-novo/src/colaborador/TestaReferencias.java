package colaborador;

public class TestaReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(3000);

        //---------------------------------------------------
        //Polimorfismo é:
        //podemos declarar variável do mesmo tipo, ou do tipo 'mais genérico', para um objeto, assim:
        Gerente g2 = new Gerente();
        g2.setSalario(3500);
        Funcionario g3 = new Gerente();
        g3.setSalario(2800);

        //---------------------------------------------------
        Funcionario f1 = new Funcionario();
        f1.setSalario(2000);
        EditorVideo e1 = new EditorVideo();
        e1.setSalario(2500);


        ControleBonificacao controleBonificacao = new ControleBonificacao();

        controleBonificacao.registra(g1);
        controleBonificacao.registra(g2);
        controleBonificacao.registra(g3);  //- não funcionava, porque a referência dessa variável é funcionário e esse objeto pede Gerente como referência
        controleBonificacao.registra(f1);  // mas, graças ao polimorfismo, agora todos os funcionários são aceitos nesse método
        controleBonificacao.registra(e1);  //diminuindo para apenas 1 método 'registra' ao invés de 1 por tipo de funcionário =D

        System.out.println(controleBonificacao.getSomaDasBonificacoes());
    }

}
