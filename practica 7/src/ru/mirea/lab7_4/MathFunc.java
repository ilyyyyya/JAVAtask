package ru.mirea.lab7_4;

public class MathFunc implements MathCalculable{

    private double mRe;
    private double mIm;

    public MathFunc(double mRe, double mIm) {
        this.mRe = mRe;
        this.mIm = mIm;
    }

    public MathFunc() {

    }

    public double getRe() {
        return mRe;
    }

    public double getIm() {
        return mIm;
    }



    @Override
    public double Degree(double a, int b) {
        double result =1;
        for(int i=1;i<=b;i++){
            result = result *a;
        }
        return result;
    }

    @Override
    public double ComNum() {
        return Math.sqrt(mRe*mRe + mIm*mIm);
    }


    @Override
    public double PI() {
        return Math.PI;
    }
}
