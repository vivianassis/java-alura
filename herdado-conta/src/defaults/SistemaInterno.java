package defaults;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Gerente g){
        boolean g.autenticou(this.senha);
        if (autenticou){
            System.out.println("Pode entrar no sistema");
        }else {System.out.println("Não pode entrar no sistema");
    }
}
