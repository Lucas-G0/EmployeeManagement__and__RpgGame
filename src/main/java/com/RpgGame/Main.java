package com.RpgGame;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        Mage mage = new Mage("Gandalf", 10, 80, 15, 5, 50, 25);
        Archer archer = new Archer("Legolas", 10, 90, 18, 8, 10);

        Character character = createChar();



        warrior.showStatus();
        System.out.println("\n----------------------------\n");
        mage.showStatus();
        System.out.println("\n----------------------------\n");
        archer.showStatus();
        System.out.println("\n----------------------------\n");
        character.showStatus();
        System.out.println("\n----------------------------\n");

        do{
            System.out.println("\n--- Battle ---\n");


            System.out.println("Its your turn. What you do?\n1 - Attack\n2 - Nothing");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Select attack target:\n1 - Warrior\n2 - Mage\n3 - Archer");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("You attacked the Warrior!");
                            character.attack(warrior);
                            break;
                        case 2:
                            System.out.println("You attacked the Mage!");
                            character.attack(mage);
                            break;
                        case 3:
                            System.out.println("You attacked the Archer!");
                            character.attack(archer);
                            break;
                        default:
                            System.out.println("Error!");
                    }
                    break;
                case 2:
                    System.out.println("You did nothing..");
                    break;
            }
            warrior.attack(mage);
            mage.castSpell(archer);
            archer.shootArrow(warrior);

            System.out.println("\n--- Status after the round ---\n");


            warrior.showStatus();
            System.out.println("\n----------------------------\n");
            mage.showStatus();
            System.out.println("\n----------------------------\n");
            archer.showStatus();
            System.out.println("\n----------------------------\n");
            character.showStatus();
            System.out.println("\n----------------------------\n");
        } while (warrior.isAlive() && mage.isAlive() && archer.isAlive() && character.isAlive());

        System.out.println("\n-------------- BATTLE ENDED ------------------\n");
    }

    @Contract(" -> new")
    public static @NotNull Character createChar(){
        System.out.println("Report character name:");
        String name = sc.next();

        System.out.println("\nReport character level:");
        int level = sc.nextInt();

        System.out.println("\nReport character HP:");
        double hp = sc.nextDouble();

        System.out.println("\nReport character ATK:");
        double atk = sc.nextDouble();

        System.out.println("\nReport character DEF:");
        double def = sc.nextDouble();

        System.out.println("\nSelect character class: \n1 - Warrior\n2 - Mage\n3 - Archer\n");
        int choice;
        do {choice = sc.nextInt();} while (choice<1 || choice>3);

        switch (choice) {
            case 1:
                System.out.println("-----------WARRIOR SELECTED----------\n");
                System.out.println("Report character extra ATK:");
                double extraATK = sc.nextDouble();
                System.out.println("\nReport character extra DEF:");
                double extraDEF = sc.nextDouble();
                System.out.println("\nWarrior created sucessfully!\n----------------------------\n");
                return new Warrior(name, level, hp, atk, def,extraATK,extraDEF);
            case 2:
                System.out.println("-----------MAGE SELECTED----------\n");
                System.out.println("Report character PM:");
                double pm = sc.nextDouble();
                System.out.println("\nReport character mana:");
                double mana = sc.nextDouble();
                System.out.println("\nMage created sucessfully!\n----------------------------\n");
                return new Mage(name, level, hp, atk, def, pm, mana);
            case 3:
                System.out.println("-----------ARCHER SELECTED----------\n");
                System.out.println("Report character accuracy:");
                double accuracy = sc.nextDouble();
                System.out.println("\nArcher created sucessfully!\n----------------------------\n");
                return new Archer(name, level, hp, atk, def, accuracy);
        }

        return new Character(name, level, hp, atk, def);
    }

}
