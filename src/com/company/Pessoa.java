package com.company;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String n, int id, float pe, float alt) {
        this.nome = n;
        this.idade = id;
        this.peso = pe;
        this.altura = alt;
    }

    public void envelhecer() {
        this.idade += 10;
        System.out.println("Agora você envelheceu e tem " + this.idade + " anos");
    }

    public void engordar() {
        this.peso += 10;
        System.out.println("Você tomou Nescau e agora tem " + this.peso +"kg");
    }

    public void emagrecer() {
        this.peso -= 10;
        System.out.println("Você não come há 3 meses e agora tem " + this.peso + "kg");
    }

    public void crescer(int id) {
        while (id < 21) {
            id += 1;
            this.altura += 0.5;
        }
        System.out.println("Você cresceu até os 21 anos e tem " + this.altura + "cm");
    }
}
