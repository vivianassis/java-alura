public class CriaConta {
    public static void main(String[] args) {

        //instanciação
        new Conta();
        Conta primeiraConta = new Conta();
        //alocação de atributo
        primeiraConta.saldo = 200;
        //acesso a atributo alocado
        System.out.println(primeiraConta.saldo);

        //novas contas
        new Conta();
        Conta segundaConta = new Conta();
        segundaConta.agencia = 1010;
        System.out.println(segundaConta.agencia);

        new Conta();
        Conta terceiraConta = new Conta();
        terceiraConta.titular = "Matheus Rodrigues";
        terceiraConta.saldo = 5000.5;
        terceiraConta.numero = 54679;
        System.out.println(terceiraConta.titular);


        //etc...

    }
}