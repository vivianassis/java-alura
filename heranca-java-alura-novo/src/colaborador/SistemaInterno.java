package colaborador;

public class SistemaInterno {

        private int senha = 2222;

        public void autentica(FuncionarioAutenticavel fa) {

            boolean autenticou = fa.autentica(this.senha);

            if (autenticou) {
                System.out.println("Logado com sucesso!");
            } else System.out.println("Falha no Login, tente novamente.");
        }



}
