public class Main {
    public static void main(String[] args) {

        Mercadinho mercado = new Mercadinho();

        mercado.adicionarCliente(new ClienteRegular("lucas", 150.0));
        mercado.adicionarCliente(new ClienteVip("criança", 100.0, "123"));
        mercado.adicionarCliente(new ClienteOuroVip("Mateus sem testa",20.0, "98765", "Rua b, 21"));

        mercado.imprimirClientes();

        System.out.println("\nValor total das compras: " + mercado.calcularTotal());
    }
}
