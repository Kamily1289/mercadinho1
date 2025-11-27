public class ClienteVip extends Cliente {
    private String numeroCartao;

    public double calcularPagamento() {
        return ValorDaCompra * 0.9;
    }

public clienteVip( String numeroCartao){
    this.numeroCartao = numeroCartao;
}
}
