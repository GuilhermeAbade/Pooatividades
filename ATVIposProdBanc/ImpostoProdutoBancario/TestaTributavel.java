import model.ContaCorrente;
import model.SeguroDeVida;
import model.ContaPoupanca;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.0);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.obterSaldo());
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calculaTributos());

        ContaPoupanca contaPoupanca = new ContaPoupanca(500.0);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.obterSaldo());
    }
}
