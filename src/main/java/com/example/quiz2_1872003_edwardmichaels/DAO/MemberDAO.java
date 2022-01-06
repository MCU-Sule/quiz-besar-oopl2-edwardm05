package com.example.quiz2_1872003_edwardmichaels.DAO;

import com.example.quiz2_1872003_edwardmichaels.Model.Member;
import com.example.quiz2_1872003_edwardmichaels.Utility.JDBCConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
//1872003 - Edward Michael S
public class MemberDAO implements daoInterface<Member> {
    @Override
    public int addData(Member data) {
        int result = 0;
        try {
            String query = "insert into anggota (id, nama, notelpon, tglLahir, tglMasuk) values (?,?,?,?,?);";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ps.setInt(1, data.getId());
            ps.setString( 2, data.getNama());
            ps.setString( 3, data.getNotelepon());
            ps.setDate(4, data.getTgllahir());
            ps.setDate(5, data.getTglmasuk());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    @Override
    public int delData(Member data) {
        return 0;
    }

    @Override
    public int updateData(Member data) {
        return 0;
    }

    @Override
    public ObservableList<Member> showData() {
        ObservableList<Member> mList = FXCollections.observableArrayList();

        try {
            String query = "select * from anggota;";
            PreparedStatement ps;
            ps = JDBCConnection.getConnection().prepareStatement(query);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nama = res.getString("nama");
                String alamat = res.getString("alamat");
                String notelepon = res.getString("notelpon");
                Date tgllahir = res.getDate("tglLahir");
                Date tglmasuk = res.getDate("tglMasuk");
                Member member = new Member(id, nama, alamat, notelepon, tgllahir, tglmasuk);
                mList.add(member);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mList;
    }
}
