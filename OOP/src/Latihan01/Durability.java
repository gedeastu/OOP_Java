package Latihan01;

public class Durability {
    String name;
    double Durable;
    int level;
    String type;

    Durability(double Durable, String name, int level, String type){
        this.Durable = Durable;
        this.name = name;
        this.level = level;
        this.type = type;
    }

    String detailDurability (double Durable, String name, int level, String type){
        this.Durable = Durable;
        this.name = name;
        this.level = level;
        this.type = type;
        return "Durability : " + "\n" + "Name => " + name + "\n" + "Durable => " + Durable + "\n" + "Level => " + level + "\n" + "Type => " + type;
    }
}
