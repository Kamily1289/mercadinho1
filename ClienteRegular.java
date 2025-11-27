public class ClienteRegular extends Cliente {
    public ClienteRegular(String m, double p) {
        super(m, p);
    }

    public double calcularPagamento() {
        return ValorDaCompra;
    }

    public String toString() {
        return "Nome " + nome + "ValorDaCompra" + ValorDaCompra;
    }
}