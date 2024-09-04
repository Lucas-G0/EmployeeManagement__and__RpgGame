package com.RpgGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    void testAttack() {
        Character atacante = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        Character defensor = new Mage("Gandalf", 10, 80, 15, 5, 50, 25);
        atacante.attack(defensor);
        assertTrue(defensor.isAlive());
        assertEquals(60, defensor.getHP()); // 80 DE HP DO DEFENSOR - 20 DE ATAQUE DO GUERREIRO - 5 DE ATAQUE EXTRA
    }

    @Test
    void testReceiveDMG() {
        Character personagem = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receiveDMG(20);
        assertEquals(80, personagem.getHP());
    }

    @Test
    void testEstaVivo() {
        Character personagem = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receiveDMG(100);
        assertFalse(personagem.isAlive());
    }
}