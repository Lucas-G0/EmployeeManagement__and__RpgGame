package com.RpgGame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {
    @Test
    void testAtirarFlecha() {
        Archer arqueiro = new Archer("Legolas", 10, 90, 18, 8, 10);
        Character inimigo = new Warrior("Thorin", 10, 100, 20, 10, 5, 2);
        arqueiro.shootArrow(inimigo);
        assertEquals(84, inimigo.getHP()); // 18 atk + 10 (precisao) de dano - 10 (def) - 2 (extra def) = 16 de dano
    }
}