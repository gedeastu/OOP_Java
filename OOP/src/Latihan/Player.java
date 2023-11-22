package Latihan;

class Player {

    String name;
    double health;
    double power;
    int age;
    float speed;

    //Object for player
    Durability durability;
    Jutsu jutsu;

    Player(String name, double health, int age, float speed, double power){
        this.name = name;
        this.health = health;
        this.age = age;
        this.speed = speed;
        this.power = power;
    }

    void equipJutsu(Jutsu jutsu) {
        this.jutsu = jutsu;
    }

    void equipDurability(Durability durability){
        this.durability = durability;
    }

    void attack(Player opponent){
        System.out.println(this.name + " Attacking " + opponent.name);
    }

    void defence(double damage){
        System.out.println(this.name + " gots damage " + damage);
    }

    void aboutNaruto(){
        System.out.println(this.name + " is has power " + this.power + " and great health " + this.health + ",\nhe age is " + this.age + " but he is too slow speed " + this.speed);
        System.out.println("\n");
        System.out.println(this.durability.detailDurability(durability.durable , durability.name, durability.level, durability.type));
        System.out.println("\n");
        System.out.println(this.jutsu.detailJutsu(jutsu.damage, jutsu.name, jutsu.level, jutsu.type));
    }

    void aboutSasuke(){
        System.out.println(this.name + " is has power " + this.power + " and great health " + this.health + ",\nhe age is " + this.age + " but he is too slow speed " + this.speed);
        System.out.println("\n");
        System.out.println(this.durability.detailDurability(durability.durable , durability.name, durability.level, durability.type));
        System.out.println("\n");
        System.out.println(this.jutsu.detailJutsu(jutsu.damage, jutsu.name, jutsu.level, jutsu.type));
    }
}
