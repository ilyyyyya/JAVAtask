package ru.mirea.lab32;

import java.io.Serializable;

public class TerritoriesInfo implements Serializable {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public TerritoriesInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TerritoriesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
