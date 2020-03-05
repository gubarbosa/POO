package com.company;

public class Main {

    public static void main(String[] args) {
	Bola bolinha = new Bola("vermelho", (float)8.5, "plástico");
	bolinha.mostraCor();
	bolinha.trocaCor("azul");
	bolinha.mostraCor();
	Quadrado quadrado = new Quadrado(4);
	quadrado.retornarValorLado();
    quadrado.mudarValorLado(6);
    quadrado.retornarValorLado();
    quadrado.calcularArea();
    Pessoa people = new Pessoa("Gustavo", 17, (float)66.5, 176);
    people.envelhecer();
    people.engordar();
    people.emagrecer();
    people.crescer(17);
    TV tv = new TV(10, 0);
    tv.informarCanal();
    tv.aumentarVolume();
    tv.diminuirVolume();
    BichinhoVirtual bicho = new BichinhoVirtual("Tiago", true, false, 25);
    bicho.alterarNome("Batata");
    bicho.alterarFome(false);
    bicho.alterarSaude(true);
    bicho.alterarIdade(29);
    bicho.calcularHumor();
    System.out.println("Humor: " +bicho.calcularHumor());
    BombaCombustivel bomba = new BombaCombustivel("etanol", (float)3.66, (float)100);
    bomba.abastecerPorValor((float)109.8);
    bomba.abastecerPorLitro(30);
    bomba.alterarValorLitro((float)3.00);
    bomba.alterarTipoCombustivel("diesel");
    bomba.alterarQntdCombustivel(50);
}
}
