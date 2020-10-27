package ListaContas;

public class CCorrente {
    private int numero;
    private float saldo;

    public CCorrente(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
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

    @Override
    public String toString() {
        return ("Conta:" + this.numero + " Saldo:" + this.saldo);
    }
}

