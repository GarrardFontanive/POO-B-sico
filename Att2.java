public class Att2 {
    private int inicio;
    private int fim;

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public boolean precisaInverter() {
        return inicio > fim;
    }

    public void inverter() {
        int temp = this.inicio;
        this.inicio = this.fim;
        this.fim = temp;
    }

    public void mostrarIntervalo() {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return ("Intervalo definido entre " + inicio + " e " + fim);
    }
}
