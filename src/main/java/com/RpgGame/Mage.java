package com.RpgGame;

import org.jetbrains.annotations.NotNull;

public class Mage extends Character {
    private double mana;
    private double PM;

    public double getMana() {
        return mana;
    }

    public Mage(String name, long level, double HP, double ATK, double DEF, double PM, double mana) {
        super(name, level, HP, ATK, DEF);
        this.mana = mana;
        this.PM = PM;
    }

    @Override
    public void attack(@NotNull Character target) {
        double targetDEF = target.getDEF();
        double attackerATK = this.PM;
        double damage = attackerATK - targetDEF;

        if (damage < 0) damage = 0;

        if (this.mana>10) {
            target.receiveDMG(damage);
            this.mana -= 10;
        } else
            System.out.println(this.getName() + "ran out of mana! 💧");
        showAttack(target, damage);
    }

    @Override
    public void showAttack(@NotNull Character target, double damage){
        super.showAttack(target, damage);
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("Mana: " + this.mana);
        System.out.println("PM: " + this.PM);
    }
}
