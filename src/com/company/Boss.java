package com.company;

public class Boss {

    private int health;
    private int damage;
    private String physical;

    public int getHealth() {
        return health;

    }

    public void setHealth(int health) {
        if (health < 800) {
            System.out.println("Invalid value is set");
        } else {
            this.health = health;
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 70) {
            System.out.println("Invalid value is set");
        } else {
            this.damage = damage;
        }
    }

    public String getPhysical() {

        return physical;
    }

    public void setPhysical(String physical) {

        this.physical = physical;
    }


}
