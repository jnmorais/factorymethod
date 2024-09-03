package org.projetos;

public class FuncionarioFactory {

    public static Funcionario obterFuncionario(String nomeFuncionario) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.projetos." + nomeFuncionario);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cargo inexistente ou inválido");
        }
        if (!(objeto instanceof Funcionario)) {
            throw new IllegalArgumentException("Cargo inválido");
        }
        return (Funcionario) objeto;
    }
}
