import java.util.Scanner;

public class Att2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Att2 intervalo = new Att2();

        System.out.println("Informe o primeiro número do intervalo: ");
        int num1 = sc.nextInt();
        intervalo.setInicio(num1);

        System.out.println("Informe o segundo número do intervalo: ");
        int num2 = sc.nextInt();
        intervalo.setFim(num2);

        if (intervalo.precisaInverter()) {
            System.out.println("\nAviso: Os números foram informados em ordem inversa. Realizando a inversão para a contagem.");
            intervalo.inverter();
        }

        System.out.println(intervalo.toString());

        System.out.println("Números no intervalo:");
        intervalo.mostrarIntervalo();

        sc.close();
    }
}
