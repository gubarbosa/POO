package com.company;

public class Quadrado {
    private int tamanho_lado;

    public Quadrado(int tl) {
        this.tamanho_lado = tl;
    }

    public void mudarValorLado(int tl) {
        this.tamanho_lado = tl;
    }

    public void retornarValorLado() {
        System.out.println("O valor do lado agora é " + this.tamanho_lado);
    }

    public void calcularArea() {
        double area = Math.pow((float) this.tamanho_lado, 2);
        System.out.println("O valor da área do quadrado é de " + area + "m²");
    }
}
