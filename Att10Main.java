public class Att10Main {
    public static void main(String[] args) {
        Att10 tv = new Att10(5, 20);
        System.out.println(tv);
        tv.setCanal(10);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        System.out.println(tv);
    }
}
