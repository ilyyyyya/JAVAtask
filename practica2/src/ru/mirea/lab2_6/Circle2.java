package ru.mirea.lab2_6;

public class Circle2 {
    private double x,y,r;

    Circle2(double x,double y,double r)
    {
        this.x=x;
        this.y=y;
        this.r=r;
    }
    public void moveCircle2(double a, double b){
        x=x+a;
        y=y+b;
    }
    public void zoomCircle2(double r){
        this.r = this.r*r;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getR(){
        return r;
    }
    public void setR(double r){
        this.r=r;
    }
    public Circle2(){
        x=0.0;
        y=0.0;
        r=1.0;
    }
    double square(){
        double s = Math.PI * r * r;
        return s;
    }
    double circum() {
        return 2 * Math.PI * r;
    }
    public String toString(){
        return "Окружность с центром (x=" +x+" y="+ y+") и радиусом (r="+r+")";
    }
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        Circle2 incircle = (Circle2)obj;
        return ((this.getX()==incircle.getX())&&(this.getY()==incircle.getY())&&((this.getR()==incircle.getR())))?true:false;



    }



}
