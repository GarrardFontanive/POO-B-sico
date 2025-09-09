import java.util.Scanner;

public class Att4Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: R$ ");
        double valorHora = input.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = input.nextDouble();

        Att4 funcionario = new Att4(valorHora, horasTrabalhadas);

        System.out.println("\n===== Demonstrativo de Pagamento =====");
        System.out.printf("+ Salário Bruto    : R$ %.2f\n", funcionario.calcularSalarioBruto());
        System.out.printf("- IR (11%%)         : R$ %.2f\n", funcionario.calcularIR());
        System.out.printf("- INSS (8%%)       : R$ %.2f\n", funcionario.calcularINSS());
        System.out.printf("- Sindicato (5%%)  : R$ %.2f\n", funcionario.calcularSindicato());
        System.out.printf("= Salário Líquido  : R$ %.2f\n", funcionario.calcularSalarioLiquido());

        input.close();
    }
}
