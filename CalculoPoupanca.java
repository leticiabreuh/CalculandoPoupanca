public class CalculoPoupanca {
    // Atributos
    private int anos;
    private double depositoMensal;
    private int qtdMeses;
    private double total;
    private final double juros = 5.0 / 100; // 0,05%

    // Setters
    public void setAnos(int anos) {
        this.anos = anos;
    }

    public void setDepositoMensal(double depositoMensal) {
        this.depositoMensal = depositoMensal;
    }

    // Métodos
    public void calculoMeses() {
        qtdMeses = anos * 12;
    }

    public double calculoPoupanca() {
        calculoMeses(); // garantir que qtdMeses esteja calculado
        total = (depositoMensal * (Math.pow(1 + juros, qtdMeses) - 1)) / juros;
        return total;
    }
}
