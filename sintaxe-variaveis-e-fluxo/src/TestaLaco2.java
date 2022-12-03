public class TestaLaco2 {
    public static void main(String[] args) {
               for(int linha = 0; linha < 5; linha++) {
                    for (int coluna = 0; coluna < 5; coluna++) {
                        if (coluna > linha) {
                            break;
                            //break para a execução de comandos internos do bloco no qual está e mantém a execução de comandos externos
                        }
                        System.out.print(coluna + 1);
                    }
                    System.out.println();
                }
            }
        }
