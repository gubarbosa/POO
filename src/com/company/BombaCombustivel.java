package com.company;

public class BombaCombustivel {
    private String tipo_combustivel;
    private int valor_litro;
    private int qntd_combustivel;

    BombaCombustivel(String tipo_combustivel, int valor_litro, int qntd_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
        this.valor_litro = valor_litro;
        this.qntd_combustivel = qntd_combustivel;
    }

    private int abastecerPorValor() {
        int qntd_litros = this.qntd_combustivel / this.valor_litro;
        return qntd_litros;
    }
}
