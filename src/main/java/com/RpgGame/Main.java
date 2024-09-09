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

        System.out.println("\n********************************\n");
        System.out.println("\t Roleplay Game System");
        System.out.println("\n********************************\n");
        Character character = createChar();


        showAll(warrior, mage, archer, character);

        do{
            System.out.println("\n------------ Battle ------------\n");


            System.out.println("Its your turn. What you do?\n\n1: Attack\n2: Nothing");
            int choice = sc.nextInt();
            System.out.println("\n--------------------------------\n");
            switch (choice) {
                case 1:
                    System.out.println("Select attack target:\n\n1: Warrior\n2: Mage\n3: Archer");
                    int choice2 = sc.nextInt();
                    System.out.println("\n--------------------------------\n");
                    switch (choice2) {
                        case 1:
                            character.attack(warrior);
                            break;
                        case 2:
                            character.attack(mage);
                            break;
                        case 3:
                            character.attack(archer);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("You did nothing...");
                    break;
            }
            warrior.attack(mage);
            mage.attack(archer);
            archer.attack(warrior);

            showAll(warrior, mage, archer, character);

        } while (warrior.isAlive() && mage.isAlive() && archer.isAlive() && character.isAlive());

        System.out.println("\n--------- BATTLE ENDED ---------\n");
    }

    private static void showAll(Warrior warrior, Mage mage, Archer archer, Character character) {
        System.out.println("\n--------------------------------\n" +
                "\t\t Player's Info" +
                "\n--------------------------------\n");
        warrior.showStatus();
        System.out.println("\n--------------------------------\n");
        mage.showStatus();
        System.out.println("\n--------------------------------\n");
        archer.showStatus();
        System.out.println("\n--------------------------------\n");
        character.showStatus();
        System.out.println("\n--------------------------------\n");
    }

    @Contract(" -> new")
    public static @NotNull Character createChar(){
        System.out.println("\t Create your character ");
        System.out.println("\n--------------------------------\n");
        System.out.println("Enter character name:");
        String name = sc.next();

        System.out.println("\nEnter character level:");
        int level = sc.nextInt();

        System.out.println("\nEnter character HP:");
        double hp = sc.nextDouble();

        System.out.println("\nEnter character ATK:");
        double atk = sc.nextDouble();

        System.out.println("\nEnter character DEF:");
        double def = sc.nextDouble();

        System.out.println("\n--------------------------------\n" +
                "\t Select character class" +
                "\n--------------------------------\n" +
                "\n1: Warrior\n2: Mage\n3: Archer\n");
        int choice;
        do {choice = sc.nextInt();} while (choice<1 || choice>3);
        System.out.println("--------------------------------\n");

        switch (choice) {
            case 1:
                System.out.println("------- WARRIOR SELECTED -------\n");
                System.out.println("Enter character extra ATK:");
                double extraATK = sc.nextDouble();
                System.out.println("\nEnter character extra DEF:");
                double extraDEF = sc.nextDouble();
                System.out.println("\n--------------------------------\n" +
                        "Warrior created sucessfully!" +
                        "\n--------------------------------\n");
                return new Warrior(name, level, hp, atk, def,extraATK,extraDEF);
            case 2:
                System.out.println("\n--------- MAGE SELECT ----------\n");
                System.out.println("Enter character PM:");
                double pm = sc.nextDouble();
                System.out.println("\nEnter character mana:");
                double mana = sc.nextDouble();
                System.out.println("\n--------------------------------\n" +
                        "Mage created sucessfully!" +
                        "\n--------------------------------\n");
                return new Mage(name, level, hp, atk, def, pm, mana);
            case 3:
                System.out.println("\n-------- ARCHER SELECT ---------\n");
                System.out.println("Enter character accuracy:");
                double accuracy = sc.nextDouble();
                System.out.println("\n--------------------------------\n" +
                        "Archer created sucessfully!" +
                        "\n--------------------------------\n");
                return new Archer(name, level, hp, atk, def, accuracy);
        }

        return new Character(name, level, hp, atk, def);
    }

}
