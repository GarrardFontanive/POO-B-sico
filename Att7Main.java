public class Att7Main {
    public static void main(String[] args) {
        Att7 pessoa = new Att7("Carlos", 20, 95, 185);
        System.out.println(pessoa);
        pessoa.envelhecer();
        pessoa.engordar(2);
        pessoa.crescer(1);
        System.out.println(pessoa);
    }
}
