package com.RpgGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void testAtacarComForcaExtra() {
        Warrior guerreiro = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);

        Character inimigo = new Mage("Gandalf", 10, 80, 15, 5, 50, 25);
        guerreiro.attack(inimigo);
        assertEquals(60, inimigo.getHP()); // 20 + 5 (força extra) - 5 (defesa) = 20 de dano
    }
}