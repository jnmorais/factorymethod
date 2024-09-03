package org.projetos;

public class FuncionarioGerente implements Funcionario {
    @Override
    public String imprimir(String funcao) {
        System.out.println("Funcionario: " + funcao);
        return funcao;
    }
}
