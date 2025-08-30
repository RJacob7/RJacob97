package Comodin;

public class FunsNumeric <T extends Number>{
    private T num;

    public FunsNumeric(T num){
        this.num = num;
    }

    double reciprocal(){
        return 1 / this.num.doubleValue();
    }

    double fraction(){
        return this.num.doubleValue() - this.num.intValue();
    }

    //Determina si los valores absolutos de dos objetos son iguales
    public boolean absIgual(FunsNumeric<?> otro){
        if (Math.abs(this.num.doubleValue()) == Math.abs(otro.num.doubleValue())) return true;
        return false;
    }

    T getNum(){
        return this.num;
    }
}
