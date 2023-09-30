public class CalculadoraImpostos {
    public static void main(String[] args) {
        OperacaoComercial operacao1 = new OperacaoComercial("servico", 100.0);
        OperacaoComercial operacao2 = new OperacaoComercial("produto", 200.0);

        ImpostoTaxa iss = new ISS();
        ImpostoTaxa icms = new ICMS();
        ImpostoTaxa ipi = new IPI();

        double impostoTaxa1 = iss.calcularImpostoTaxa(operacao1);
        double impostoTaxa2 = icms.calcularImpostoTaxa(operacao2);
        double impostoTaxa3 = ipi.calcularImpostoTaxa(operacao2);

        double valorTotal1 = operacao1.getValorItem() + impostoTaxa1;
        double valorTotal2 = operacao2.getValorItem() + impostoTaxa2 + impostoTaxa3;

        System.out.println("Detalhes da Operação 1:");
        System.out.println("Tipo: " + operacao1.getTipo());
        System.out.println("Valor do Item: " + operacao1.getValorItem());
        System.out.println("Valor do ISS: " + impostoTaxa1);
        System.out.println("Valor Total: " + valorTotal1);

        System.out.println("\nDetalhes da Operação 2:");
        System.out.println("Tipo: " + operacao2.getTipo());
        System.out.println("Valor do Item: " + operacao2.getValorItem());
        System.out.println("Valor do ICMS: " + impostoTaxa2);
        System.out.println("Valor do IPI: " + impostoTaxa3);
        System.out.println("Valor Total: " + valorTotal2);
    }
}
