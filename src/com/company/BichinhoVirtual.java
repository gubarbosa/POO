package com.company;

public class BichinhoVirtual {
    private String nome;
    private boolean fome;
    private boolean saude;
    private int idade;

    public BichinhoVirtual(String nm, boolean fm, boolean sau, int ida) {
        this.nome = nm;
        this.fome = fm;
        this.saude = sau;
        this.idade = ida;
    }

    public void alterarNome(String nm) {
        this.nome = nm;
        System.out.println("O nome do Bichinho é " + this.nome);
    }

    public void alterarFome(boolean fm) {
        this.fome = fm;
        System.out.println("A fome do Bichicho é " + this.fome);
    }

    public void alterarSaude(boolean sau) {
        this.saude = sau;
        System.out.println("A saúde do Bichico é " + this.saude);
    }

    public void alterarIdade(int ida) {
        this.idade = ida;
        System.out.println("A idade do Bichicho é " + this.idade);
    }

    public String calcularHumor() {
        String humor = "";
        if (this.fome == true && this.saude == false) {
            humor = "Baixo";
        } else if (this.fome == true && this.saude == true) {
            humor = "Baixo";
        } else if (this.fome = false && this.saude == false) {
            humor = "Médio";
        } else {
            humor = "Alto";
        }
        return humor;
    }
}
