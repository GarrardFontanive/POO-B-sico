public class Att10 {
    private int canal;
    private int volume;

    public Att10(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal <= 999) this.canal = canal;
    }

    public void aumentarVolume() {
        if (volume < 100) volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) volume--;
    }

    public String toString() {
        return "Canal: " + canal + " | Volume: " + volume;
    }
}
