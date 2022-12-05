public class Testareferencias {
    public static void main(String[] args) {
        //primeiraConta é uma referencia um ponteiro para o objeto
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta: " +primeiraConta.saldo);//300.0

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo segunda conta é: " + segundaConta.saldo); //300.0
        //as duas variáveis apontam para o mesmo objeto, mas nenhuma é o objeto, são referencias

        //Só existe um único objeto instanciado na classe TestaReferencias.
        segundaConta.saldo +=100;
        System.out.println(primeiraConta.saldo); //400.0

        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta.");
        }

    }
}
