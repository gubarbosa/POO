package com.company;

public class Bola {
    private String cor;
    private float circunferencia;
    private String material;

    public Bola(String c, float cir, String mat) {
        this.cor = c;
        this.circunferencia = cir;
        this.material = mat;
    }

    public void trocaCor(String c) {
        this.cor = c;
    }

    public void mostraCor() {
        System.out.println("A cor da bola agora é " + this.cor);
    }
}