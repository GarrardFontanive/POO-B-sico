public class Att8Main {
    public static void main(String[] args) {
        Att8 conta = new Att8(123, "Carlos", 1000);
        System.out.println(conta);
        conta.deposito(500);
        conta.saque(200);
        conta.alterarNome("Carlos G.");
        System.out.println(conta);
    }
}
