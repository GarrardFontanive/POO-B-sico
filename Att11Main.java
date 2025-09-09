public class Att11Main {
    public static void main(String[] args) {
        Att11 bomba = new Att11("Gasolina", 5.50, 100);
        System.out.println(bomba);
        bomba.abastecerPorValor(55);
        bomba.abastecerPorLitro(5);
        bomba.alterarValor(6.0);
        bomba.alterarCombustivel("Etanol");
        bomba.alterarQuantidadeCombustivel(200);
        System.out.println(bomba);
    }
}
