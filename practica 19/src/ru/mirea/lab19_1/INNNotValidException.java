package ru.mirea.lab19_1;

import java.math.BigInteger;

public class INNNotValidException extends Exception{
    private BigInteger innNum;

    public INNNotValidException(BigInteger innNum) {
        super("INN with number: " + innNum + " is not valid!!!");
        this.innNum = innNum;
    }

    public BigInteger getInnNum(){
        return innNum;
    }

}
