package com.RpgGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    @Test
    void testLancarMagia() {
        Mage mago = new Mage("Gandalf", 10, 80, 15, 5, 25, 50);
        Character inimigo = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        mago.castSpell(inimigo);
        assertEquals(87, inimigo.getHP()); // 25 (poder mágico) - 10 (defesa) - 2 de extra def = 13 de dano = 87 de vida
        assertEquals(40, mago.getMana()); // 50 - 10 de mana usada
    }

    @Test
    void testLancarMagiaSemMana() {
        Mage mago = new Mage("Gandalf", 10, 80, 15, 5, 25, 5);
        Character inimigo = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        mago.castSpell(inimigo);
        assertEquals(100, inimigo.getHP()); // Não deve causar dano, pois não tem mana suficiente
        assertEquals(5, mago.getMana()); // Mana permanece inalterada
    }
}