public class ClienteVip extends Cliente {
    prtected String numeroCartao;

    public ClienteVip(String numeroCartao, String c, double j) {
        super(c, j);
        this.numeroCartao = numeroCartao;

    }

    public double calcularPagamento() {
        return ValorDaCompra * 0.9;
    }

public clienteVip( String numeroCartao){
    this.numeroCartao = numeroCartao;
}
}

