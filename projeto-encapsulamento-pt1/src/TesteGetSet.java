public class TesteGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        conta.deposita(300);
        System.out.println(conta.getSaldo());

        Cliente matheus = new Cliente();
        //conta.titular = matheus;
        matheus.setNome("Matheus Rodrigues");
        conta.setTitular(matheus);
        conta.setAgencia(1337);
        conta.setNumero(45678-2);

        System.out.println(conta.getTitular().getNome());
        //A cada ponto (.) ele anda um 'caminho' a frente nos métodos para alcançar as informações

        conta.getTitular().setProfissao("programador");
        //ou
            //Cliente titularDaConta = conta.getTitular();
            //titularDaConta.setProfissao("programador");
        //é o mesmo

            //System.out.println(titularDaConta);
        System.out.println(matheus);
        System.out.println(conta.getTitular());
        //Todos dão no mesmo resultado, pois são a mesma coisa, só inicializamos um cliente.

    }
}
