package colaborador;

public class EditorVideo extends Funcionario{
    public double getBonificacao(){
        return super.getBonificacao() +100; //a porcentagem estabelecida, + 100 reis
    }
}
