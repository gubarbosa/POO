package ListaContas;

public class CContas {

    public static void main(String[] args) {

        ListaClientes lista1 = new ListaClientes();

        Cliente c1 = new Cliente("344.915.210-69", "Neymar Junior");
        Cliente c2 = new Cliente("829.150.260-92", "Julia Barbosa Espindula");
        Cliente c3 = new Cliente("566.947.970-01", "Leonardo Edenir");
        Cliente c4 = new Cliente("375.918.700-50", "Cipriano Rosa");

        CCorrente conta1 = new CCorrente(1, (float)200);
        c1.adicionarContas(conta1);
        lista1.adicionarClientes(c1);
        System.out.println(c1.getContas());

        CEspecial conta2 = new CEspecial(2, (float)1320, 1000);
        c2.adicionarContas(conta2);
        lista1.adicionarClientes(c2);
        System.out.println(c2.getContas());

        CPoupança conta3 = new CPoupança(3, (float)4000, 200);
        c3.adicionarContas(conta3);
        lista1.adicionarClientes(c3);
        System.out.println(c3.getContas());

        CInvestimento conta4 = new CInvestimento(4, (float)4250, 9, 20);
        c4.adicionarContas(conta4);
        lista1.adicionarClientes(c4);
        System.out.println(c4.getContas());

        lista1.imprimirClientes();
    }
}