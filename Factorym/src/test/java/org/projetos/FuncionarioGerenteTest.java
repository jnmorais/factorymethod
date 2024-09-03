package org.projetos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {
    @Test
    public void testImprimir() {
        Funcionario gerente = new FuncionarioGerente();
        String resultado = gerente.imprimir("Gerente");
        assertEquals("Gerente", resultado);
    }

}