public class TestaValores {

    public static void main(String[] args) {

        //variáveis guardam valores e não referências
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;
        //quanto vale o segundo, 5 ou 10?
        System.out.println(segundo);
        //o segundo vale 5 pois guardou o valor do primeiro e não a referência da variável 'primeiro'
    }

}
