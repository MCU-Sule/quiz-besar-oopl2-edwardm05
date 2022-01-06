package com.example.quiz2_1872003_edwardmichaels.Model;

import java.util.Date;
//1872003 - Edward Michael S
public class Member {
    private int id;
    private String nama;
    private String alamat;
    private String notelepon;
    private java.sql.Date tgllahir;
    private java.sql.Date tglmasuk;

    public Member(int id, String nama, String alamat, String notelepon, Date tgllahir, Date tglmasuk) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.notelepon = notelepon;
        this.tgllahir = (java.sql.Date) tgllahir;
        this.tglmasuk = (java.sql.Date) tglmasuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public void setNotelepon(String notelepon) {
        this.notelepon = notelepon;
    }

    public java.sql.Date getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = (java.sql.Date) tgllahir;
    }

    public java.sql.Date getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(Date tglmasuk) {
        this.tglmasuk = (java.sql.Date) tglmasuk;
    }

    @Override
    public String toString() {
        return nama;
    }
}
