public class OperacaoComercial {
    private String tipo;
    private double valorItem;

    public OperacaoComercial(String tipo, double valorItem) {
        this.tipo = tipo;
        this.valorItem = valorItem;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorItem() {
        return valorItem;
    }
}
