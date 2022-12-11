package colaborador;
public class ControleBonificacao {

    private double somaDasBonificacoes;
    //antes precisávamos de todos os métodos, mas graças ao polimorfismo, todos os filhos podem se enquadrar no método cuja referência é mais genérica
    public void registra(Funcionario f){

        double bonificacaoNova = f.getBonificacao(); //ainda assim, ele chama o método específico da classe a qual o objeto solicitante pertence (editor, gerente, ou funcionario comum)
        this.somaDasBonificacoes = this.somaDasBonificacoes + bonificacaoNova;
    }
    public double getSomaDasBonificacoes() {
        return somaDasBonificacoes;
    }
}

     /* public void registra(Gerente g){

        double bonificacaoNova = g.getBonificacao();
        this.somaDasBonificacoes = this.somaDasBonificacoes + bonificacaoNova;
    }

      public void registra(EditorVideo e){

        double bonificacaoNova = e.getBonificacao();
        this.somaDasBonificacoes = this.somaDasBonificacoes + bonificacaoNova;
    }*/



