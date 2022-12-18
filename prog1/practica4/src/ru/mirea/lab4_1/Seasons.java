package ru.mirea.lab4_1;

public enum Seasons {
    WINTER(-3) , SPRING(15), SUMMER(25){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(5);

    private double avgTmp;

    Seasons(double avgTmp){
        //this.avgTmp=avgTmp;
   }

    public double getAvgTmp(){
        return avgTmp;
    }

    public String getDescription(){
        return "Холодное время года";
    }

}
