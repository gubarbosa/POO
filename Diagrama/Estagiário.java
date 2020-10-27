package Diagrama;

public class Estagiário extends Empregado {
    private int descontos;

    public Estagiário(int codigo, String nome, String email, float salario, int descontos) {
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }

    @Override
    public void aumentoSalarial(int porcentagem) {
        super.setSalario(((super.getSalario() * porcentagem) - this.descontos));
    }

}