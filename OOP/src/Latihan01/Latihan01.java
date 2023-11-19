package Latihan01;

public class Latihan01 {
    public static void main(String[] args) {
        System.out.println("test");

        Player naruto = new Player("Uzumaki Naruto", 5000d, 23, 80.0f, 2000d);
        Jutsu rasengan = new Jutsu(500, "Rasengan", 1, "Wind Jutsu");
        System.out.println(naruto.name + naruto.age);
    }
}
