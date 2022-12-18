package colaborador;

public class TestaSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Administrador a = new Administrador();
        EditorVideo ev = new EditorVideo();

        g.setSenha(2222);
        a.setSenha(3333);
        //ev.setSenha(4444); - Só autenticáveis tem esse método

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(a);
        //si.autentica(ev);  -  Não pode pq ele não extende funcionário autenticável
    }
}
