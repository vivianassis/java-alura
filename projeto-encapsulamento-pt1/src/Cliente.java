public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    //refactor > encapsulate_fields para métodos cujas funções são pegar e realizar modificações nos atributos das classes sem que seja possível acessá-los diretamente

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
