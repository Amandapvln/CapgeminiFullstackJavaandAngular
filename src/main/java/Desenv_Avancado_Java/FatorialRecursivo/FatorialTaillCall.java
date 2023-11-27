package main.java.Desenv_Avancado_Java.FatorialRecursivo;

public class FatorialTaillCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA(double valor){
        return fatorialComTaillCall(valor, 1);
    }

    public static double fatorialComTaillCall(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialComTaillCall(valor - 1, numero * valor);
    }
}
