package Comodin;

public class ComodinDemo {
    public static void main(String[] args){
        FunsNumeric<Integer> iOb =
                new FunsNumeric<>(6);

        FunsNumeric <Double> dOb =
                new FunsNumeric<>(-6.0);

        FunsNumeric<Long> lOb =
                new FunsNumeric<>(5L);

        System.out.println("Probando iOb y dOb");
        if (iOb.absIgual(dOb))
            System.out.println("Los valores absolutos son iguales");
        else
            System.out.println("Los valores absolutos son diferentes");

        System.out.println();
        System.out.println("Probando iOb y lOb");
        if (iOb.absIgual(lOb))
            System.out.println("Los valores absolutos son iguales");
        else
            System.out.println("los valores absolutos son diferentes");
    }
}
