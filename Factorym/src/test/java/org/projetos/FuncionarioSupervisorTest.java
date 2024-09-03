package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioSupervisorTest {
    @Test
    public void testImprimir() {
        Funcionario supervisor = new FuncionarioSupervisor();
        String resultado = supervisor.imprimir("Supervisor");
        assertEquals("Supervisor", resultado);
    }
}