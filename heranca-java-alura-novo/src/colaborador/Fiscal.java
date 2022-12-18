package colaborador;

public class Fiscal implements Autenticavel{
    private AutenticacaoUtil autenticador;

    //Composição usa classe com o código repetido escrito dentro dela, chamando-os nos locais
    //onde ele será usado (através do construtor, e do corpo dos métodos)

    public Fiscal(){
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
