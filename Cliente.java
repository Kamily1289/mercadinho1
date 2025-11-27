public abstract class Cliente {
    protected String nome;
    protected double ValorDaCompra;

    public Cliente(String e, double x) {
        this.nome = e;
        this.ValorDaCompra = x;
    }

    public abstract double calcularPagamento();

    public double getValorDaCompra() {
        return ValorDaCompra;
    }

    public abstract String toString();
}
