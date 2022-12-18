package ru.mirea.lab4_2;

public enum SizeClose {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(34), S(36), M(38), L(40);


    private double euroSize;

    SizeClose(double euroSize) {
        this.euroSize = euroSize;
    }

    public double getSizeClose() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

}