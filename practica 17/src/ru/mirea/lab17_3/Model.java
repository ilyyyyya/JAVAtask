package ru.mirea.lab17_3;

public class Model {
    private String firstname;
    private String Lastname;

    /*public Model(String firstname, String lastname) {
        this.firstname = firstname;
        Lastname = lastname;
    }*/

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
