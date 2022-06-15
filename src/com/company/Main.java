package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(70);
        boss.setPhysical("Magic");
        System.out.println("Boss info: " + " Health - " + boss.getHealth() +" Damage - " + boss.getDamage() +
           " Dafense - "  + boss.getPhysical());



    }



}
