package colaborador;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setCpf("123.123.123-12");
        g1.setSalario(2345.43);
        g1.setSenha(1234);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.autenticaGerente(2123));
    }
}
