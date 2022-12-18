package colaborador;

public class Administrador extends Funcionario implements Autenticavel{
    @Override
    public double getBonificacao() {
        return 500;
    }

    private int senha;
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
