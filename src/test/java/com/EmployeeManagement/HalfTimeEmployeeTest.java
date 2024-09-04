package com.EmployeeManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HalfTimeEmployeeTest {
    @Test
    void testCalcularSalarioPorHora() {
        HalfTimeEmployee funcionario = new HalfTimeEmployee("Maria", "987.654.321-00", 20, 50);
        assertEquals(1000.0, funcionario.calcSalary(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        HalfTimeEmployee funcionario = new HalfTimeEmployee("Maria", "987.654.321-00", 20, 50);
        funcionario.showInfo();
        assertEquals("Maria", funcionario.getName());
        assertEquals("987.654.321-00", funcionario.getCpf());
        assertEquals(1000.0, funcionario.calcSalary(), 0.001);
    }
}