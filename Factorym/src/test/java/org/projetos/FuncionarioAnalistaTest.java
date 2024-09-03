package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioAnalistaTest {
    @Test
    public void testImprimir() {
        Funcionario analista = new FuncionarioAnalista();
        String resultado = analista.imprimir("Analista");
        assertEquals("Analista", resultado);
    }

}