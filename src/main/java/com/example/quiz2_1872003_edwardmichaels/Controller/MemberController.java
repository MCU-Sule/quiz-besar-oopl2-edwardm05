package com.example.quiz2_1872003_edwardmichaels.Controller;

import com.example.quiz2_1872003_edwardmichaels.DAO.MemberDAO;
import com.example.quiz2_1872003_edwardmichaels.Model.Member;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
//1872003 - Edward Michael S
public class MemberController implements Initializable {
    public Label labelID;
    public Label labelNama;
    public Label labelTanggalLahir;
    public TextField tfName;
    public TextField tfID;
    public Label labelPhone;
    public Label labelTanggalMasuk;
    public Button btnSave;
    public TextField tfPhone;
    public DatePicker dpTanggalLahir;
    public DatePicker dpTanggalMasuk;
    public TableView<Member> tableView;
    public TableColumn<Member, Integer> col1;
    public TableColumn<Member, String> col2;
    public TableColumn<Member, String> col3;
    public TableColumn<Member, Date> col4;
    public TableColumn<Member, Date> col5;

    ObservableList<Member> mList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mList = FXCollections.observableArrayList();
        MemberDAO mDao = new MemberDAO();
        ObservableList<Member> mList = mDao.showData();
        tableView.setItems(mList);
        col1.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getId()).asObject());
        col2.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNama()));
        col3.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNotelepon()));
    }

    public void btnSaveClicked(ActionEvent actionEvent) {
    }


}
