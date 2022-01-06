package com.example.quiz2_1872003_edwardmichaels.Model;

import java.sql.Date;
//1872003 - Edward Michael S
public class Peminjaman {
    private int id;
    private Date tanggalpinjam;
    private Date tanggalkembali;
    private int buku_id;
    private int anggota_id;

    public Peminjaman(int id, Date tanggalpinjam, Date tanggalkembali, int buku_id, int anggota_id) {
        this.id = id;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
        this.buku_id = buku_id;
        this.anggota_id = anggota_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(Date tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public Date getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(Date tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public int getBuku_id() {
        return buku_id;
    }

    public void setBuku_id(int buku_id) {
        this.buku_id = buku_id;
    }

    public int getAnggota_id() {
        return anggota_id;
    }

    public void setAnggota_id(int anggota_id) {
        this.anggota_id = anggota_id;
    }

}
