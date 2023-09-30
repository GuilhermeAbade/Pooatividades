public class ISS implements ImpostoTaxa {
    private static final double ALIQUOTA = 0.046;

    @Override
    public double calcularImpostoTaxa(OperacaoComercial operacao) {
        if (operacao.getTipo().equals("servico")) {
            return operacao.getValorItem() * ALIQUOTA;
        }
        return 0.0;
    }
}
