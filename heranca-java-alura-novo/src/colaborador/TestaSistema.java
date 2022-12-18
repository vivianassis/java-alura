package colaborador;

public class TestaSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Administrador a = new Administrador();
        EditorVideo ev = new EditorVideo();
        Fiscal f = new Fiscal();

        Cliente cliente = new Cliente();

        g.setSenha(2222);
        a.setSenha(3333);
        f.setSenha(4444);
        //ev.setSenha(4444); - Só autenticáveis tem esse método

        cliente.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(a);
        si.autentica(f);
        si.autentica(cliente);
        //si.autentica(ev);  -  Não pode pq ele não extende funcionário autenticável
    }
}
