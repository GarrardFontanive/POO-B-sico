import java.util.Scanner;

public class Att5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int codigo;

        do {
            System.out.print("Digite o código do item (0 para encerrar): ");
            codigo = sc.nextInt();
            if (codigo == 0) break;

            System.out.print("Digite a quantidade: ");
            int qtd = sc.nextInt();

            Att5 item = new Att5(codigo, qtd);
            double valor = item.calcularValor();

            if (valor > 0) {
                total += valor;
                System.out.printf("Item: R$ %.2f\n", valor);
            } else {
                System.out.println("Código inválido");
            }
        } while (codigo != 0);

        System.out.printf("Total geral: R$ %.2f\n", total);
        sc.close();
    }
}
