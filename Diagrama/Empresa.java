package Diagrama;

public class Empresa {
    public static void main(String[] args) {
        Empregado e1 = new Empregado(1, "Carlos", "carlos@gmail.com", 3000);
        e1.aumentoSalarial(5);
        System.out.println(e1.getSalario());

        Chefe e2 = new Chefe(2, "Augusto", "augusto@gmail.com", 1300, 2);
        e2.aumentoSalarial(10);
        System.out.println(e2.getSalario());

        Estagiário e3 = new Estagiário(3, "Renato", "renato@gmail.com", 800, 200);
        e3.aumentoSalarial(15);
        System.out.println(e3.getSalario());
    }
}
