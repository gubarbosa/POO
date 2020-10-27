package ListaContas;

import java.util.List;
import java.util.ArrayList;

public class ListaClientes {
    private List<Cliente> clientes;

    public ListaClientes() {
        clientes = new ArrayList<Cliente>();
    }

    public void adicionarClientes(Cliente cli) {
        clientes.add(cli);
    }

    public void imprimirClientes() {
        for(Cliente cli:clientes)
            System.out.println(cli);
    }
}
