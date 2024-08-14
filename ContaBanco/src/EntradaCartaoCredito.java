import java.util.Locale;
import java.util.Scanner;

public class EntradaCartaoCredito {

    public static void processarPagamento(String tipoCartao) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o valor da transação: ");
        double valor = scanner.nextDouble();

        System.out.println("1- À vista \n2- Parcelado");
        int cod_pagmt = scanner.nextInt();

        switch (cod_pagmt) {
            case 1:
                System.out.printf("Pagamento %s aprovado à vista de R$%.2f%n", tipoCartao, valor);
                break;
            case 2:
                System.out.println("Informe o número de parcelas (2 a 5): ");
                int parcelas = scanner.nextInt();

                if (parcelas < 2 || parcelas > 5) {
                    System.out.println("Número de parcelas inválido.");
                    return;
                }

                double taxaJuros = 0.04;
                double valorParcelado;

                if (parcelas <= 3) {
                    valorParcelado = valor / parcelas;
                    System.out.printf("Pagamento %s aprovado em %dx sem juros de R$ %.2f%n", tipoCartao, parcelas, valorParcelado);
                } else {
                    valorParcelado = (valor * Math.pow(1 + taxaJuros, parcelas)) / parcelas;
                    System.out.printf("Pagamento %s aprovado em %dx com juros de 4%% ao mês\nValor por parcela: R$ %.2f%n", tipoCartao, parcelas, valorParcelado);
                }
                break;
            default:
                System.out.println("Código de pagamento inválido.");
                break;
        }

        scanner.close();
    }
}