impot java.util.Scanner;

public class CalculoPoupanca{
    public static void main(String[]args){
        Scanner scanner = new Scanner (Systen.in);

        int anos;
        double juros;
        double depositoMensal;
        int qtdAnos;
        double total;

        anos = scanner.nextInt();
        jurosMes = scanner.nextDouble();
        depositoMensal = scanner.nextDouble();

        juros = 0.05 /100;
        qtdMeses = anos * 12;
        total = (depositoMensal * (Math.pow(1+juros, qtdMeses) - 1)) / juros;

       System.out.println("Total poupado R$: "+total);







    }
}