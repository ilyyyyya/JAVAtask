package ru.mirea.lab32;

import java.io.Serializable;

public class ResourcesInfo implements Serializable {

    private String info;

    public ResourcesInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ResourcesInfo{" +
                "info='" + info + '\'' +
                '}';
    }
}
