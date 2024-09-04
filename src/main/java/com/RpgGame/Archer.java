package com.RpgGame;

import org.jetbrains.annotations.NotNull;

public class Archer extends Character {
    private double accuracy;

    public Archer(String name, long level, double HP, double ATK, double DEF, double accuracy) {
        super(name, level, HP, ATK, DEF);
        this.accuracy = accuracy;
    }

    public void shootArrow(@NotNull Character target){
        double targetDEF = target.getDEF();
        double attackerATK = this.getATK() + this.accuracy;
        double damage = attackerATK - targetDEF;

        if (damage < 0) damage = 0;

        target.receiveDMG(damage);
        System.out.println("Arrow shooted!");
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("Accuracy: " + this.accuracy);
    }

}
