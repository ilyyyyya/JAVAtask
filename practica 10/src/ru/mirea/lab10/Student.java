package ru.mirea.lab10;

import java.util.Comparator;

public class Student implements Comparable {
    public String fullName;
    public String special;
    public int kurs;
    public int groupe;
    public int idNum;
    public int mark;

    public Student(String fullName, String special, int kurs, int groupe, int idNum, int mark) {
        this.fullName = fullName;
        this.special = special;
        this.kurs = kurs;
        this.groupe = groupe;
        this.idNum = idNum;
        this.mark = mark;
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

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Object o) {
        return this.mark - ((Student)o).mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", special='" + special + '\'' +
                ", kurs=" + kurs +
                ", groupe=" + groupe +
                ", idNum=" + idNum +
                ", mark=" + mark +
                '}';
    }
}
