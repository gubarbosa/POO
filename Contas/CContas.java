package Contas;

public class CContas {

    public static void main(String[] args) {
        CCorrente conta1 = new CCorrente(1, (float)250, "Gustavo Barbosa Espindula");
        conta1.debitar((float)100);
        System.out.println(conta1.get_saldo());
        conta1.creditar((float)65);
        System.out.println(conta1.get_saldo());

        CEspecial conta2 = new CEspecial(2, (float)1000, "Ozaina Bonifácio Barbosa Espindula", 2000);
        conta2.debitar((float) 1000);
        System.out.println(conta2.get_saldo());
        conta2.creditar((float)900);
        System.out.println(conta2.get_saldo());

        CPoupança conta3 = new CPoupança(3, (float)650, "Ariosvaldo Espindula", 100);
        conta3.debitar((float) 500);
        System.out.println(conta3.get_saldo());
        System.out.println(conta3.get_saldominimo());
        conta3.creditar((float)300);
        System.out.println(conta3.get_saldo());
        conta3.atualizar_saldo();
        System.out.println(conta3.get_saldo());

        CInvestimento conta4 = new CInvestimento(4, (float)10000, "Arthur", 4, 20);
        conta4.atualizar_saldo();
        System.out.println(conta4.get_saldo());

        CInvestimento conta5 = new CInvestimento(5, (float)12000, "Arthur", 7, 20);
        conta5.atualizar_saldo();
        System.out.println(conta5.get_saldo());
    }
}
