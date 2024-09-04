package com.EmployeeManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FullTimeEmployeeTest {

    @Test
    void testCalculateSalaryAndBonus() {
        FullTimeEmployee funcionario = new FullTimeEmployee("João", "123.456.789-00", 5000, 10);
        assertEquals(5500.0, funcionario.calcSalary(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        FullTimeEmployee funcionario = new FullTimeEmployee("João", "123.456.789-00", 5000, 10);
        funcionario.showInfo();
        assertEquals("João", funcionario.getName());
        assertEquals("123.456.789-00", funcionario.getCpf());
        assertEquals(5500.0, funcionario.calcSalary(), 0.001);
    }
}