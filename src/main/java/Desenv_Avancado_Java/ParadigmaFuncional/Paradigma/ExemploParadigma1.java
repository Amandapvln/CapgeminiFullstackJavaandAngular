package main.java.Desenv_Avancado_Java.Paradigma;

import java.util.function.Function;

public class ExemploParadigma1 {
    public static void main(String[] args) {
        Function<Integer, Object>
                buscarUsuario = idUsuario ->
                //buscar usuário
                new Object();

        System.out.println(buscarUsuario);
    }
}

