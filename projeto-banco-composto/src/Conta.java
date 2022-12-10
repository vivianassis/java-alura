public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    //tipo 'Conta' tem 4 atributos

    //metodo deposita
    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }        // ou += valor
    //this é opcional, ele se referecia para 'essa instancia'


    //metodo saca
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor; //tire valor dele mesmo
            return true;
        }else{
            return false;
        }
    }

    //metodo transfere
    public boolean transfere(double valor, Conta destino){

        if (this.saldo >=valor){
            this.saldo -=valor;
            destino.deposita(valor); // o mesmo de dizer destino '+= valor'
            return true;
        }else {
            return false;
        }
    }
    //metodo que devolve o saldo, pois privamos o saldo
    public double getSaldo(){
        return this.saldo;
    }

}


