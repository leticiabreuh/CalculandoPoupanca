import java.util.Scanner;

public class ProgramaPoupanca{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        int anos;
        double depositoMensal;
        int qtdMeses;
        double total;

        anos = scanner.nextInt();
        depositoMensal = scanner.nextDouble();

        double juros = 0.05 /100;
        qtdMeses = anos * 12;
        total = (depositoMensal * (Math.pow(1+juros, qtdMeses) - 1)) / juros;

       System.out.printf("Total poupado R$: %.2f ",total);


    }
}