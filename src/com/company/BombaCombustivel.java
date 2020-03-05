package com.company;

public class BombaCombustivel {
    private String tipo_combustivel;
    private float valor_litro;
    private float qntd_combustivel;

    public BombaCombustivel(String tipo_combustivel, float valor_litro, float qntd_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
        this.valor_litro = valor_litro;
        this.qntd_combustivel = qntd_combustivel;
    }

    public void abastecerPorValor(float valor) {
        float qntd = valor/this.valor_litro;
        this.qntd_combustivel += qntd;
        System.out.printf("%.2f litros \n", qntd);
    }

    public void abastecerPorLitro(float litros) {
        this.qntd_combustivel += litros;
        System.out.printf("Valor a ser pago: R$ %.2f \n", litros * this.valor_litro);
    }

    public void alterarValorLitro(float valor_litro) {
        this.valor_litro = valor_litro;
        System.out.printf("O valor do litro agora é de R$ %.2f \n",this.valor_litro);
    }

    public void alterarTipoCombustivel(String tipo_com) {
        this.tipo_combustivel = tipo_com;
        System.out.println("Tipo do combustível: \n"+ this.tipo_combustivel);
    }

    public void alterarQntdCombustivel(float qntd_com) {
        this.qntd_combustivel = qntd_com;
        System.out.printf("Litros disponíveis: %.2f \n",this.qntd_combustivel);
    }
}
