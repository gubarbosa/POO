package Diagrama;

public class Empregado {
    private int codigo;
    private String nome;
    private String email;
    private float salario;

    public Empregado(int codigo, String nome, String email, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float novo_salario) {
        this.salario = novo_salario;
    }

    public void aumentoSalarial(int porcentagem) {
        this.salario = this.salario * porcentagem;
    }
}
