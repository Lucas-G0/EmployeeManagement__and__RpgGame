package com.EmployeeManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testCalcularSalario() {
        Employee funcionario = new Employee("Ana", "123.456.789-00", 3000);
        assertEquals(3000.0, funcionario.calcSalary(), 0.001);
    }

    @Test
    void testGettersAndSetters() {
        Employee funcionario = new Employee("Ana", "123.456.789-00", 3000);
        funcionario.setName("Ana Silva");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalary(3200);

        assertEquals("Ana Silva", funcionario.getName());
        assertEquals("111.222.333-44", funcionario.getCpf());
        assertEquals(3200.0, funcionario.calcSalary(), 0.001);
    }
}