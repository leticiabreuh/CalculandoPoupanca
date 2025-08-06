import java.util.Scanner;

public class ProgramaPoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculoPoupanca poupanca = new CalculoPoupanca();

        System.out.print("Digite os anos: ");
        int anos = scanner.nextInt();
        System.out.print("Digite o depósito mensal: ");
        double deposito = scanner.nextDouble();

        poupanca.setAnos(anos);
        poupanca.setDepositoMensal(deposito);

        double total = poupanca.calculoPoupanca();

        System.out.printf("Total poupado R$: %.2f\n", total);

        scanner.close();
    }
}
