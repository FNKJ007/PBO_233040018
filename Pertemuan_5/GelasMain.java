package Pertemuan_5;

public class GelasMain {
    public static void main(String[] args) {
        Gelas g1 = new Gelas("Hitam");
        Gelas g2 = new Gelas("Biru");

        System.out.println("Sebelum");
        System.out.println("warna g1:"+g1.getWarna());
        System.out.println("warna g2:"+g2.getWarna());
        TukarWarnaGelas(g1,g2);
        System.out.println("Sesudah");
        System.out.println("warna g1:"+g1.getWarna());
        System.out.println("warna g2:"+g2.getWarna());


    }

    static void TukarWarnaGelas(Gelas g1, Gelas g2) {
        String tampung = g1.getWarna();
        Gelas gTemp = new Gelas("Temp");
        gTemp.setWarna(g2.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(tampung);
    }
}
