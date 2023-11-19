package Latihan01;

public class Latihan01 {
    public static void main(String[] args) {
        Player naruto = new Player("Uzumaki Naruto", 5000d, 23, 80.0f, 2000d);

        Jutsu rasengan = new Jutsu(500, "Rasengan", 1, "Wind Jutsu");
        rasengan.detailJutsu(500d, "Rasengan", 1, "Wind Jutsu");

        Durability KuramaShield = new Durability(1000d, "Kurama Shield", 1, "Chakra");
        KuramaShield.detailDurability(1000d, "Kurama Shield", 1, "Chakra");

        naruto.equipJutsu(rasengan);
        naruto.equipDurability(KuramaShield);

        System.out.println("\n");
        naruto.aboutNaruto();
        System.out.println("\n");
    }
}
