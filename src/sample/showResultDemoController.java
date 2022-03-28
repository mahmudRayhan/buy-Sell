package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class showResultDemoController implements Initializable {

    private Main main;

    ResultSet rs;


    @FXML
    Label showResult;

    @FXML
    private TableView<ListResult> Table1;



    @FXML
    private TableColumn<ListResult, String> c1;

    @FXML
    private TableColumn<ListResult, String> c2;

    @FXML
    private TableColumn<ListResult, String> c3;

    @FXML
    private TableColumn<ListResult, String> c4;

    @FXML
    private TableColumn<ListResult, String> c5;

    @FXML
    private TableColumn<ListResult, String> c6;

    private ObservableList<ListResult> data;



    void setMain(Main main,ResultSet rs) {
        this.main = main;
        this.rs = rs;

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Table1 = new TableView<>();
        System.out.println("here");
        c1 =new TableColumn<ListResult , String>("name Column");
        c1.setCellValueFactory(new PropertyValueFactory("title"));
        c2 =new TableColumn<ListResult , String>("name Column");
        c2.setCellValueFactory(new PropertyValueFactory("anme"));
        c3 =new TableColumn<ListResult , String>("name Column");
        c4 =new TableColumn<ListResult , String>("name Column");
        c5 =new TableColumn<ListResult , String>("name Column");
        c6 =new TableColumn<ListResult , String>("name Column");


        List<ListResult> list =new ArrayList<ListResult>();
        list.add( new ListResult(" 132" , "23 " ));
        data = FXCollections.observableList(list);

        System.out.println(data.size());
        Table1.setItems(data);
        //Table1.getColumns().setAll(c1 , c2);

    }

    void setRs(ResultSet r){

        rs=r;

    }


}