package main.java.Desenv_Avancado_Java.Paradigma;

public class ExemploParadigma2 {
    public static void main(String[] args) {

        Funcao1 funcao1 = valor -> valor;
        System.out.println(funcao1.gerar("Amanda Lino"));
    }
}

@FunctionalInterface
interface Funcao1 {
    String gerar(String valor);
}
