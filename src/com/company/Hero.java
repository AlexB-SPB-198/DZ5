package com.company;

public class Hero {
    private int health;
    private int damage;
    private String fast;


    public Hero (int health, int damage, String fast) {
        System.out.println(this);
        this.health = health;
        this.damage = damage;
        this.fast = fast;
    }

    public Hero (int health, int damage) {
        System.out.println(this);
        this.health = health;
        this.damage = damage;
    }
    public int  getHealth(int health) {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getFast() {
        return fast;
    }


}









