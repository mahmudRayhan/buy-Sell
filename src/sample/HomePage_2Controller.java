package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomePage_2Controller {

    private Main main;

    @FXML
    private Button search;

    void SearchAction(ActionEvent event) throws SQLException, ClassNotFoundException {


        String sql = "select product_name from product \n" +
                "where user_id in (select user_id from users where area_id in(\n" +
                "\tselect area_id from area where area_name='Rajshahi');";

        System.out.println(sql);

        ResultSet rs = PSQL.query(sql);




//        try {
//            main.showResultDemo_11(rs);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        while ( rs.next() ) {

            //System.out.println("inside the rs");

            String name = rs.getString(1);
            System.out.println(name);
        }
        System.out.println("End");



    }

















    void setMain(Main main) {
        this.main = main;
    }
}
