package ContasComCliente;

public class CContas {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("344.915.210-69", "Neymar Junior");
        Cliente c2 = new Cliente("829.150.260-92", "Julia Barbosa Espindula");
        Cliente c3 = new Cliente("566.947.970-01", "Leonardo Edenir");
        Cliente c4 = new Cliente("375.918.700-50", "Cipriano Rosa");

        CCorrente conta1 = new CCorrente(1, (float)200, c1);
        System.out.println(conta1);

        CEspecial conta2 = new CEspecial(2, (float)1320, c2, 1000);
        System.out.println(conta2);

        CPoupança conta3 = new CPoupança(3, (float)4000, c3, 200);
        System.out.println(conta3);

        CInvestimento conta4 = new CInvestimento(4, (float)4250, c4, 9, 20);
        System.out.println(conta4);
    }
}