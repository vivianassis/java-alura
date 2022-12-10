public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    //Aqui aprendemos sobre o construtor da classe conta, com ele, vamos passar parametros obrigatórios para a criação da classe
    //Agora para abrir a conta, precisamos logo de cara passar a agência e o número, e eles não podem ser 0, resolvendo o problema que ocorre quando, no Java, o valor padrão de um atributo é 0
    //Agora não poderemos inicializar a Conta só com (), pois o construtor pede agência e numero(da conta).
    public Conta(int agencia , int numero) {
        if (agencia <=0){
            System.out.println("Por favor, revise o valor inserido.");
            return;
        }
        this.agencia = agencia;
        if (numero <=0){
            System.out.println("Por favor, revise o valor inserido.");
            return;
        }
        this.numero = numero;
        System.out.println("Estou criando a conta " + numero);
    }

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
        this.numero = numero;
    }
    //o número DESSA CONTA valerá o número recebido como argumento na chamada do método

    //escrevendo o 'getAge... + enter' a ide completa, porque o atributo é privado e presume-se que se criará o método
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

    //não precisamos do 'setSaldo', pois ja temos métodos de manipulação para 'saldo' suficientes!



}


