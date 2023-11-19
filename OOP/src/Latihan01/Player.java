package Latihan01;

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

    void identityNaruto(){
        System.out.println(this.name + " is has power " + this.power + " and great health " + this.health + ", he age is " + this.age + " but he is too slow speed " + this.speed);
    }
}
