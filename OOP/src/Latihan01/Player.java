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
}
