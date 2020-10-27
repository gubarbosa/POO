package Diagrama;

public class Chefe extends Empregado {
    private float benefício;

    public Chefe(int codigo, String nome, String email, float salario, float benefício) {
        super(codigo, nome, email, salario);
        this.benefício = benefício;
    }

    @Override
    public void aumentoSalarial(int porcentagem) {
        super.setSalario(((super.getSalario() * porcentagem) + this.benefício));
    }
}
