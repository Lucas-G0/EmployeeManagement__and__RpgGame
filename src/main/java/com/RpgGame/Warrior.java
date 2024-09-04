package com.RpgGame;

import org.jetbrains.annotations.NotNull;

public class Warrior extends Character {
    private double extraATK;
    private double extraDEF;

    public Warrior(String name, long level, double HP, double ATK, double DEF, double extraATK, double extraDEF) {
        super(name, level, HP, ATK, DEF);
        this.extraATK = extraATK;
        this.extraDEF = extraDEF;
    }

    @Override
    public void attack(@NotNull Character target) {
        double targetDEF = target.getDEF();
        double attackerATK = this.getATK() + this.extraATK;
        double damage = attackerATK - targetDEF;

        if (damage < 0) damage = 0;

        target.receiveDMG(damage);
        System.out.println("Attack sucessfull!");
    }

    @Override
    public void receiveDMG(double damage) {
        double newHP = this.getHP() + this.extraDEF - damage;
        this.setHP(newHP);
        if (this.getHP()<=0){
            this.setAlive(false);
        }
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("ExtraATK: " + this.extraATK);
        System.out.println("ExtraDEF: " + this.extraDEF);
    }
}
