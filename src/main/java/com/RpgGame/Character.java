package com.RpgGame;

import org.jetbrains.annotations.NotNull;

public class Character {
    private String name;
    private long level;
    private boolean alive = true;
    private double HP;
    private double ATK;
    private double DEF;

    public Character(String name, long level, double HP, double ATK, double DEF) {
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.DEF = DEF;
        this.ATK = ATK;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getATK() {
        return ATK;
    }

    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getDEF() {
        return DEF;
    }

    public void setDEF(double DEF) {
        this.DEF = DEF;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(@NotNull Character target) {
        double targetDEF = target.getDEF();
        double attackerATK = this.getATK();
        double damage = attackerATK - targetDEF;

        if (damage < 0) damage = 0;

        target.receiveDMG(damage);
        System.out.println("Attack sucessfull!");
    }

    public void receiveDMG(double damage) {
        double newHP = this.getHP() - damage;
        this.setHP(newHP);
        if (this.HP<=0){
            this.setAlive(false);
        }
    }

    public void showStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.HP);
        System.out.println("ATK: " + this.ATK);
        System.out.println("DEF: " + this.DEF);
        System.out.println("Status: " + (this.alive?"ALIVE":"DEAD"));
    }
}
