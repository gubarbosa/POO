package ListaContas;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String cpf;
    private String nome;
    private List contas;

    public Cliente(String cpf, String nome)  {
        this.cpf = cpf;
        this.nome = nome;
        this.contas = new ArrayList<CCorrente>();
    }

    public void adicionarContas(CCorrente conta) {
        contas.add(conta);
    }

    public List getContas() {
        return contas;
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
