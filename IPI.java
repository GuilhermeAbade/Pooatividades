public class IPI implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.25;

    @Override
    public double calcularImpostoTaxa(OperacaoComercial operacao) {
        if (operacao.getTipo().equals("produto")) {
            return operacao.getValorItem() * ALIQUOTA;
        }
        return 0.0;
    }
}
