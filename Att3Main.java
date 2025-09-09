import java.util.Scanner;

public class Att3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Att3 obj = new Att3();

        System.out.println("Digite um valor: ");
        double valora = sc.nextFloat();
        obj.setA(valora);

        System.out.println("Digite outros valor: ");
        double valorb = sc.nextFloat();
        obj.setB(valorb);

        System.out.println(obj.toString());

    }
}
