public class Att4 {
    private double valorHora;
    private double horasTrabalhadas;

    public Att4(double valorHora, double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double calcularIR() {
        return calcularSalarioBruto() * 0.11;
    }

    public double calcularINSS() {
        return calcularSalarioBruto() * 0.08;
    }

    public double calcularSindicato() {
        return calcularSalarioBruto() * 0.05;
    }

    public double calcularTotalDescontos() {
        return calcularIR() + calcularINSS() + calcularSindicato();
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularTotalDescontos();
    }
}
