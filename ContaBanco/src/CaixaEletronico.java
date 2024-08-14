import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

    public static void realizarSaque(double saldo) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Valor para saque: \n");
        double valorSolicitado = scanner.nextDouble();

        String validacao;
        if (valorSolicitado > saldo) {
            validacao = "Não possui saldo suficiente.";
        } else if (valorSolicitado < 0) {
            validacao = "Erro! Valor não identificado.";
        } else {
            validacao = "Transação aprovada. Você sacou: " + valorSolicitado + ". Seu saldo restante é: " + (saldo - valorSolicitado);
        }

        System.out.println(validacao);
        scanner.close();
    }
}