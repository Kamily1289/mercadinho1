public class Mercadinho {
    private Cliente[] Clientes = new Cliente[10];
    private int pos = 0;

    public void adicionarCliente(Cliente cliente) {
        Clientes[pos] = cliente;
        pos++;
    }

    public double calcularTotal() {
        double TotalDaCompra = 0;
        // percorrer a lista
        for (Cliente each : Clientes) {
            // pegar os valores e somar
            TotalDaCompra += each.getValorDaCompra();
        }
        return TotalDaCompra;
        // retornar o total
    }

    public void imprimirClientes() {
        for (Cliente cliente : Clientes) {
            System.out.println(cliente.toString());

        }
    }

}
