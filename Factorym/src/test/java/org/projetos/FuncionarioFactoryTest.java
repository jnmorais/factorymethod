package org.projetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioFactoryTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioInexistente() {
        try {
            Funcionario funcionario = FuncionarioFactory.obterFuncionario("FuncionarioInexistente");
            fail("Esperava-se uma exceção, mas nenhuma foi lançada.");
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo inexistente ou inválido", e.getMessage());
        }
    }

}
