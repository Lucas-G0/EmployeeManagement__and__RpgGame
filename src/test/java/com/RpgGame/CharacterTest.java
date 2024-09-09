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
        assertEquals(60, defensor.getHP()); // 80 DE HP DO DEFENSOR - 20 DE ATAQUE DO GUERREIRO - 5 DE ATAQUE EXTRA - 5 de DEF = 60 DE VIDA
    }

    @Test
    void testReceiveDMG() {
        Character personagem = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receiveDMG(20);
        assertEquals(82, personagem.getHP()); // 20 de dano - 2 extra def = 18 de dano = 82 de vida
    }

    @Test
    void testEstaVivo() {
        Character personagem = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receiveDMG(102);
        assertFalse(personagem.isAlive()); //102 de dano - 100 de vida - 2 de extra def
    }

    @Test
    void testShowStatus(){
        Character personagem = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.showStatus();
    }
}