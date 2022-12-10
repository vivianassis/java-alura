public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    // a partir daqui vamos começar a criar metodos para acessar os atributos privados indiretamente

    //devolve o saldo
    public double getSaldo(){
        return this.saldo;
    }

    //devolve número da conta
    public int getNumero() {
        return this.numero;
    }

    //altera, determina, designa 'número' da conta
    public void setNumero(int numero){
        if ( numero <=0 ) {
            System.out.println("Por favor, revise o valor inserido.");
            return;
        }
        this.numero = numero;
    }
    //o número DESSA CONTA valerá o número recebido como argumento na chamada do método

    //escrevendo o 'getAge... + enter' a ide completa pois o atributo é privado e presume-se que se criará o método
    public int getAgencia() {
        return agencia;
    }

    //'setAge...' + enter'
    public void setAgencia(int agencia) {
        if ( agencia <=0 ){
            System.out.println("Por favor, revise o valor inserido.");
            return;//return 'sem nada', para a execução.
        }
        this.agencia = agencia;
    }

    //=
    public Cliente getTitular() {
        return titular;
    }

    //=
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //não precisamos do 'setSaldo' pois ja temos métodos de manipulação de saldo suficientes!



}


