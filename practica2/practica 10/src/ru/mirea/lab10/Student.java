package ru.mirea.lab10;

import java.util.Comparator;

public class Student  {
    public String fullName;
    public String special;
    public int kurs;
    public int groupe;


    public Student(String fullName, String special, int kurs, int groupe) {
        this.fullName = fullName;
        this.special = special;
        this.kurs = kurs;
        this.groupe = groupe;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

}
