package Latihan;

public class Latihan {
    public static void main(String[] args) {
        Player naruto = new Player("Uzumaki Naruto", 5000d, 23, 80.0f, 2000d);
        Player sasuke =  new Player("Uchiha Sasuke", 4000d, 23, 80.0f, 2000d);

        Jutsu rasengan = new Jutsu(500d, "Rasengan", 1, "Wind Jutsu");
        rasengan.detailJutsu(500d, "Rasengan", 1, "Wind Jutsu");
        Jutsu chidori = new Jutsu(450, "Chidori", 1, "Lightning Jutsu");
        chidori.detailJutsu(450d, "Chidori", 1, "Lightning Jutsu");

        Durability KuramaShield = new Durability(1000d, "Kurama Shield", 1, "Chakra");
        KuramaShield.detailDurability(1000d, "Kurama Shield", 1, "Chakra");
        Durability SusanoShield = new Durability(1000d, "Susano Shield", 1, "Sharingan");

        naruto.equipJutsu(rasengan);
        naruto.equipDurability(KuramaShield);

        sasuke.equipJutsu(chidori);
        sasuke.equipDurability(SusanoShield);

        System.out.println("\n");
        naruto.aboutNaruto();
        System.out.println("\n");
        sasuke.aboutSasuke();
    }
}
