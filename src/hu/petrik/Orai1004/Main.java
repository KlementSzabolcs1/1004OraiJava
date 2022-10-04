package hu.petrik.Orai1004;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Háromszög h = new Háromszög();
            System.out.println(h);
        }

        for (int i = 0; i < 5; i++) {
            double a = Math.random() * 10 + 5;
            double b = Math.random() * 10 + 5;
            Téglalap t = new Téglalap(a,b);
            System.out.println(t);
        }
    }
}
