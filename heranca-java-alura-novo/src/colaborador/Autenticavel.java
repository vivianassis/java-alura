package colaborador;
//'Interface':

//Entende-se como uma classe abstrata, com todos os métodos abstratos.

//Quem assina o contrato 'Autenticável'(implements Autenticavel) é obrigado
// a implementar os métodos designados dentro dele:
// setSenha e autentica.

public interface Autenticavel{
    //private int senha;
    public abstract void setSenha(int senha); //{ this.senha = senha; }

    public abstract boolean autentica(int senha); //{ return this.senha == senha; }
}
