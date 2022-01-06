package com.example.quiz2_1872003_edwardmichaels.Controller;

import com.example.quiz2_1872003_edwardmichaels.DAO.BookDAO;
import com.example.quiz2_1872003_edwardmichaels.Model.Book;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
//1872003 - Edward Michael S
public class BookController implements Initializable {
    public Label labelID;
    public Label labelJudul;
    public Label labelTahunTerbit;
    public TextField tfJudul;
    public TextField tfTahunTerbit;
    public TextField tfID;
    public Label labelPenerbit;
    public Label labelPengarang;
    public Label labelJenisBuku;
    public Button btnSave;
    public TextField tfPenerbit;
    public TextField tfPengarang;
    public TextField tfJenisBuku;
    public TableView<Book> tableView;
    public TableColumn<Book, Integer> col1;
    public TableColumn<Book, String> col2;
    public TableColumn<Book, String> col3;
    public TableColumn<Book, String> col4;
    public TableColumn<Book, String> col5;
    public TableColumn<Book, String> col6;

    ObservableList<Book> bList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bList = FXCollections.observableArrayList();
        BookDAO bDao = new BookDAO();
        ObservableList<Book> bList = bDao.showData();
        tableView.setItems(bList);
        col1.setCellValueFactory(data-> new SimpleIntegerProperty(data.getValue().getId()).asObject());
        col2.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getJudul()));
        col3.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getPenerbit()));
        col4.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getTahunterbit()));
        col5.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getPengarang()));
        col6.setCellValueFactory(data-> new SimpleStringProperty(data.getValue().getJenisbuku()));
    }

    public void btnSaveClicked(ActionEvent actionEvent) {
    }


}
