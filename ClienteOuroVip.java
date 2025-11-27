public class ClienteOuroVip extends ClienteVip {
    private String Endereco;

    public ClienteOuroVip(String w, String a, double b, String y) {
        super(a, y, b);
        this.Endereco = w;
    }

    public double calcularPagamento() {
        return ValorDaCompra * 0.85;
    }

    public String toString() {
        return "Nome " + nome + "ValorDaCompra" + calcularPagamento() + "numeroCartao" + numeroCartao + "Endereco"
                + Endereco;

    }
}
