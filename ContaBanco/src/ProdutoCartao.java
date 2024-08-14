import java.util.Locale;
import java.util.Scanner;

public class ProdutoCartao {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Deseja processar uma transação: \n 1- Cartão de crédito \n 2- Cartão de débito");
        Integer cod = scanner.nextInt();

        switch (cod) {
            case 1:
                EntradaCartaoCredito.processarPagamento("crédito");
                break;
            case 2:
                System.out.println("Funcionalidade de cartão de débito não habilitada.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
