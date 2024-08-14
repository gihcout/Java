import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá! Seja bem vindo ao banco. \nVamos acessar sua conta!\n");
        System.out.println("Digite seu primeiro nome:\n");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:\n");
        String sobrenome = scanner.next();

        System.out.println("\nQue prazer te reencontrar " + nome + " " + sobrenome);

        System.out.println("Informe sua âgencia com o digito. Ex: 000-00");
        String agencia = scanner.next();

        System.out.println("Informe a conta:");
        String conta = scanner.next();

        System.out.println("Acessando...");

        System.out.println("Deseja visualizar seu saldo ?");
        String option = scanner.next();

        double saldo = 237.48;

        if (option.equalsIgnoreCase("sim")) {
            System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
            System.out.println("Deseja realizar um saque? (sim/não)");
            String saqueOption = scanner.next();

            if (saqueOption.equalsIgnoreCase("sim")) {
                CaixaEletronico.realizarSaque(saldo);
            } else {
                System.out.println("Estamos encerrando o acesso! Volte sempre!");
            }
        } else if (option.equalsIgnoreCase("não")) {
            System.out.println("Estamos encerrando o acesso! Volte sempre!");
        } else {
            System.out.println("Resposta não identificada. Acesse a conta novamente caso necessário.");
        }

        scanner.close();
    }
}