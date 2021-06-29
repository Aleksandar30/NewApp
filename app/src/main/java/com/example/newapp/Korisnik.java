package com.example.newapp;

public class Korisnik {
    private String ime, password, mail;

    public Korisnik(String ime, String password, String mail) {
        this.ime = ime;
        this.password = password;
        this.mail = mail;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
