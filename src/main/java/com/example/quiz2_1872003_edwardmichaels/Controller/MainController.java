package com.example.quiz2_1872003_edwardmichaels.Controller;

import com.example.quiz2_1872003_edwardmichaels.DAO.BookDAO;
import com.example.quiz2_1872003_edwardmichaels.DAO.MemberDAO;
import com.example.quiz2_1872003_edwardmichaels.HelloApplication;
import com.example.quiz2_1872003_edwardmichaels.Model.Book;
import com.example.quiz2_1872003_edwardmichaels.Model.Member;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
//1872003 - Edward Michael S
public class MainController implements Initializable {

    public Label labelID;
    public Label labelPinjam;
    public Label labelMember;
    public Label labelKembali;
    public Label labelBuku;
    public Label labelBahasa;
    public ComboBox cbMember;
    public TextField tfID;
    public ComboBox cbBahasa;
    public ComboBox cbBuku;
    public DatePicker dpPinjam;
    public DatePicker dpKembali;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public Button btnReset;
    public TableView tableView;
    public TableColumn col1;
    public TableColumn col2;
    public TableColumn col3;
    public TableColumn col4;
    public TableColumn col5;

    String value = "Inggris";

    ObservableList<Book> bList;
    ObservableList<Member> mList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        bList = FXCollections.observableArrayList();
        BookDAO bDao = new BookDAO();
        ObservableList<Book> bList = bDao.showData();

        mList = FXCollections.observableArrayList();
        MemberDAO mDao = new MemberDAO();
        ObservableList<Member> mList = mDao.showData();

        cbBuku.getItems().addAll(bList);
        cbMember.getItems().addAll(mList);

        cbBahasa.getItems().addAll("Inggris","Indonesia");

        ResourceBundle bundle = ResourceBundle.getBundle("bundle_EN");
        labelID.setText(bundle.getString("id.text"));
        labelBahasa.setText(bundle.getString("bahasa.text"));
        labelPinjam.setText(bundle.getString("pinjam.text"));
        labelKembali.setText(bundle.getString("kembali.text"));
        labelMember.setText(bundle.getString("anggota.text"));
        labelBuku.setText(bundle.getString("buku.text"));
        btnSave.setText(bundle.getString("simpan.text"));
        btnUpdate.setText(bundle.getString("rubah.text"));
        btnDelete.setText(bundle.getString("hapus.text"));
        col2.setText(bundle.getString("anggota.text"));
        col3.setText(bundle.getString("buku.text"));
        col4.setText(bundle.getString("pinjam.text"));
        col5.setText(bundle.getString("kembali.text"));

    }

    public void btnSaveClicked(ActionEvent actionEvent) {
    }

    public void btnUpdateClicked(ActionEvent actionEvent) {
    }

    public void btnDeleteClicked(ActionEvent actionEvent) {
    }

    public void btnResetClicked(ActionEvent actionEvent) {
    }


    public void showMemberClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("MemberManagement.fxml"));
        Parent root = loader.load();
       MemberController mc = loader.getController();
        Stage memberStage = new Stage();
        memberStage.setTitle("Member Page");
        memberStage.setScene(new Scene(root));
        memberStage.initModality(Modality.APPLICATION_MODAL);
        memberStage.showAndWait();
    }

    public void showBookClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("bookManagement.fxml"));
        Parent root = loader.load();
        BookController bc = loader.getController();
        Stage bookStage = new Stage();
        bookStage.setTitle("Book Page");
        bookStage.setScene(new Scene(root));
        bookStage.initModality(Modality.APPLICATION_MODAL);
        bookStage.showAndWait();
    }

    public void bahasaClicked(ActionEvent actionEvent) {
        value = (String) cbBahasa.getValue();

        if (value == "Inggris"){
            ResourceBundle bundle = ResourceBundle.getBundle("bundle_EN");
            labelID.setText(bundle.getString("id.text"));
            labelBahasa.setText(bundle.getString("bahasa.text"));
            labelPinjam.setText(bundle.getString("pinjam.text"));
            labelKembali.setText(bundle.getString("kembali.text"));
            labelMember.setText(bundle.getString("anggota.text"));
            labelBuku.setText(bundle.getString("buku.text"));
            btnSave.setText(bundle.getString("simpan.text"));
            btnUpdate.setText(bundle.getString("rubah.text"));
            btnDelete.setText(bundle.getString("hapus.text"));
            col2.setText(bundle.getString("anggota.text"));
            col3.setText(bundle.getString("buku.text"));
            col4.setText(bundle.getString("pinjam.text"));
            col5.setText(bundle.getString("kembali.text"));
        }
        else if (value == "Indonesia") {
            ResourceBundle bundle = ResourceBundle.getBundle("bundle_IN");
            labelID.setText(bundle.getString("id.text"));
            labelBahasa.setText(bundle.getString("bahasa.text"));
            labelPinjam.setText(bundle.getString("pinjam.text"));
            labelKembali.setText(bundle.getString("kembali.text"));
            labelMember.setText(bundle.getString("anggota.text"));
            labelBuku.setText(bundle.getString("buku.text"));
            btnSave.setText(bundle.getString("simpan.text"));
            btnUpdate.setText(bundle.getString("rubah.text"));
            btnDelete.setText(bundle.getString("hapus.text"));
            col2.setText(bundle.getString("anggota.text"));
            col3.setText(bundle.getString("buku.text"));
            col4.setText(bundle.getString("pinjam.text"));
            col5.setText(bundle.getString("kembali.text"));
        }
    }

    public void tableClicked(SortEvent<TableView> tableViewSortEvent) {
    }
}