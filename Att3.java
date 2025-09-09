public class Att3 {
    private double a;
    private double b;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    //realizar as operacoes matematicas
    public double operacaoSum(){
        return a+b;
    }
    public double operacaoSub(){
        return a-b;
    }
    public double operacaoMul(){
        return a*b;
    }
    public double operacaoDiv(){
        return a/b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Att3{");
        sb.append("a = ").append(getA());
        sb.append(", b = ").append(getB());
        sb.append(", operação de soma = ").append(operacaoSum());
        sb.append(", operação subtração = ").append(operacaoSub());
        sb.append(", operação Multiplicação = ").append(operacaoMul());
        sb.append(", operação divisão = ").append(operacaoDiv());
        sb.append('}');
        return sb.toString();
    }
}
