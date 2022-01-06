package com.example.quiz2_1872003_edwardmichaels.DAO;

import com.example.quiz2_1872003_edwardmichaels.Model.Book;
import com.example.quiz2_1872003_edwardmichaels.Utility.JDBCConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//1872003 - Edward Michael S
public class BookDAO implements daoInterface<Book> {
    @Override
    public int addData(Book data) {
        return 0;
    }

    @Override
    public int delData(Book data) {
        return 0;
    }

    @Override
    public int updateData(Book data) {
        return 0;
    }

    @Override
    public ObservableList<Book> showData() {
        ObservableList<Book> bList = FXCollections.observableArrayList();

        try {
            String query = "select * from buku;";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                int id = res.getInt("id");
                String judul = res.getString("judul");
                String penerbit = res.getString("penerbit");
                String pengarang = res.getString("pengarang");
                String tahunterbit = res.getString("tahunTerbit");
                String jenisbuku = res.getString("jenisBuku");
                Book book = new Book(id, judul, penerbit, pengarang, tahunterbit, jenisbuku);
                bList.add(book);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return bList;
    }
}
