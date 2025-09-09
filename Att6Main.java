public class Att6Main {
    public static void main(String[] args) {
        Att6 quadrado = new Att6(10);
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.calcularArea());
        quadrado.setLado(7);
        System.out.println("Novo lado: " + quadrado.getLado());
        System.out.println("Nova área: " + quadrado.calcularArea());
    }
}
