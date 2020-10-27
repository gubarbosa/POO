package ContasComCliente;

public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome)  {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return (" Cliente:" + this.nome);
    }
}
