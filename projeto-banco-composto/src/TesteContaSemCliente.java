public class TesteContaSemCliente {
    public static void main(String[] args) {

        Conta contaDaMarcela = new Conta();
        //System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaMarcela.getSaldo());

        //  contaDaMarcela.titular.nome = "Marcela"; ((daria erro! pois não tem nenhum cliente inicializado))
        //   System.out.println(contaDaMarcela.titular.nome);

        contaDaMarcela.titular = new Cliente();// agora funciona pois inicializamos o cliente no na própria conta
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);

    }
}
