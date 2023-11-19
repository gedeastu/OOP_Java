package Latihan01;

public class Jutsu {
    String name;
    double damage;
    int level;
    String type;

    Jutsu(double damage, String name, int level, String type){
        this.damage = damage;
        this.name = name;
        this.level = level;
        this.type  = type;
    }

    String detailJutsu(double damage, String name, int level, String type ){
        this.damage = damage;
        this.name = name;
        this.level = level;
        this.type  = type;
        return "Jutsu : " + "\n" + "Name => " + name + "\n" + "Level => " + level + "\n" + "Damage => " + damage + "\n" + "Type => " + type;
    }
}
