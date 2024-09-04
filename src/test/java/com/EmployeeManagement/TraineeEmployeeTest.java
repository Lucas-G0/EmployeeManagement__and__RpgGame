package com.EmployeeManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TraineeEmployeeTest {
    @Test
    void testCalcularSalarioBolsaAuxilio() {
        TraineeEmployee estagiario = new TraineeEmployee("Pedro", "111.222.333-44", "IFPR", 1500);
        assertEquals(1500.0, estagiario.calcSalary(), 0.001);
    }

    @Test
    void testExibirInformacoes() {
        TraineeEmployee estagiario = new TraineeEmployee("Pedro", "111.222.333-44", "IFPR", 1500);
        estagiario.showInfo();
        assertEquals("Pedro", estagiario.getName());
        assertEquals("111.222.333-44", estagiario.getCpf());
        assertEquals(1500.0, estagiario.calcSalary(), 0.001);
        assertEquals("IFPR", estagiario.getSchool());
    }
}