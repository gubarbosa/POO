package Contas;

import java.sql.SQLOutput;

public class CCorrente {
    private int numero;
    private float saldo;
    private String cliente;

    public CCorrente(int numero, float saldo, String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void creditar(float valor) {
        this.saldo += valor;
    }

    public void debitar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo não suficiente");
        }
    }

    public float get_saldo() {
        return this.saldo;
    }

    public void set_saldo(float saldo) {
        this.saldo = saldo;
    }
}

