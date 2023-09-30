public class ICMS implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.17;

    @Override
    public double calcularImpostoTaxa(OperacaoComercial operacao) {
        return operacao.getValorItem() * ALIQUOTA;
    }
}
