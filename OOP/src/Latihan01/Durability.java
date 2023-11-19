package Latihan01;

public class Durability {
    String name;
    double durable;
    int level;
    String type;

    Durability(double durable, String name, int level, String type){
        this.durable = durable;
        this.name = name;
        this.level = level;
        this.type = type;
    }

    String detailDurability (double durable, String name, int level, String type){
        this.durable = durable;
        this.name = name;
        this.level = level;
        this.type = type;
        return "Durability : " + "\n" + "Name => " + name + "\n" + "Durable => " + durable + "\n" + "Level => " + level + "\n" + "Type => " + type;
    }
}
