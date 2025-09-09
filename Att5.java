public class Att5 {
    private int codigo;
    private int quantidade;

    public Att5(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        switch (codigo) {
            case 100: return 1.20;
            case 101: return 1.30;
            case 102: return 1.50;
            case 103: return 1.20;
            case 104: return 1.30;
            case 105: return 1.00;
            default: return 0;
        }
    }

    public double calcularValor() {
        return getPreco() * quantidade;
    }
}
