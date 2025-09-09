import java.util.Scanner;

public class Att1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Att1 nome = new Att1();
        System.out.println("Digite seu nome: ");
        nome.setNome(sc.next());
        System.out.println("Digite seu sobrenome: ");
        nome.setSobrenome(sc.next());

        System.out.println(nome.toString());

    }
}
