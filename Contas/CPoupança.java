package Contas;

public class CPoupança extends CCorrente {
    private float saldominimo;

    public CPoupança(int numero, float saldo, String cliente, float saldominimo) {
        super(numero, saldo, cliente);
        this.saldominimo = saldominimo;
    }

    @Override
    public void debitar(float valor) {
        if(valor <= super.get_saldo()) {
            super.set_saldo(super.get_saldo() - valor);
            if (super.get_saldo() < this.saldominimo) {
                this.saldominimo = super.get_saldo();
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void atualizar_saldo() {
        super.set_saldo((float) (super.get_saldo() + (this.saldominimo*0.05)));
        this.saldominimo = super.get_saldo();
    }

    public float get_saldominimo() {
        return this.saldominimo;
    }
}