public class Main {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.nome = "Matheus Henrique";
        matheus.cpf = "222.222.222-22";
        matheus.profissao = "programador";

        Conta contaDoMatheus = new Conta();
        contaDoMatheus.deposita(100);


        //associa cliente matheus a contaDoMatheus
        contaDoMatheus.titular = matheus;
        System.out.println(contaDoMatheus.titular.nome);
    }
}