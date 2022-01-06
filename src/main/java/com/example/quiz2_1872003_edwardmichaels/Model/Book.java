package com.example.quiz2_1872003_edwardmichaels.Model;
//1872003 - Edward Michael S
public class Book {
    private int id;
    private String judul;
    private String penerbit;
    private String pengarang;
    private String tahunterbit;
    private String jenisbuku;

    public Book(int id, String judul, String penerbit, String pengarang, String tahunterbit, String jenisbuku) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
        this.jenisbuku = jenisbuku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getJenisbuku() {
        return jenisbuku;
    }

    public void setJenisbuku(String jenisbuku) {
        this.jenisbuku = jenisbuku;
    }

    @Override
    public String toString() {
        return judul;
    }
}
