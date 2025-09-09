public class Att11 {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public Att11(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.printf("Foram abastecidos %.2f litros\n", litros);
        } else {
            System.out.println("Combustível insuficiente");
        }
    }

    public void abastecerPorLitro(double litros) {
        if (litros <= quantidadeCombustivel) {
            double valor = litros * valorLitro;
            quantidadeCombustivel -= litros;
            System.out.printf("Valor a pagar: R$ %.2f\n", valor);
        } else {
            System.out.println("Combustível insuficiente");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQtd) {
        quantidadeCombustivel = novaQtd;
    }

    public String toString() {
        return "Combustível: " + tipoCombustivel + " | Valor/Litro: R$ " + valorLitro + " | Disponível: " + quantidadeCombustivel + " L";
    }
}
