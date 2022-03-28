
package sample;


        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.TextField;

        import java.sql.ResultSet;
        import java.sql.SQLException;

        import static java.lang.Thread.sleep;

public class HomePageController {

    private Main main;
    String name;




    @FXML
    private Button search;



    @FXML
    private Button page_2;



    @FXML
    void page_2Action(ActionEvent event) {
        try {
            main.showHomePage_2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    @FXML
    void SearchAction(ActionEvent event) throws SQLException, ClassNotFoundException {


        String sql = "select product_name from product where UPPER(product_name) LIKE UPPER('%cycle%')";

        System.out.println(sql);

        ResultSet rs = PSQL.query(sql);




        try {
            main.showResultDemo(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        while ( rs.next() ) {

            //System.out.println("inside the rs");

            String name = rs.getString(1);
            System.out.println(name);
        }
        System.out.println("End");





        //jdbc.close();

        /*if(jdbc.executeQuery("select EMAIL from EMPLOYEE where EMAIL = "
                + jdbc.STR(user) + " and PASSWORD = " + jdbc.STR(pass) ).next()){

            Main.currentUser = user;
            //Get Emp ROLE
            String sql = "select EMP_ROLE from EMPLOYEE where EMAIL = " + jdbc.STR(user);
            ResultSet rs = jdbc.executeQuery(sql);
            rs.next();
            Main.role = rs.getString(1);
            System.out.println(Main.currentUser + " " + Main.role);

            //to next page
            Parent root = FXMLLoader.load(getClass().getResource("AdminHome.fxml"));
            Scene scene = new Scene(root);
            Main.currentStage.setScene(scene);
            Main.currentStage.setTitle("Admin Home");
        }else{
            error.setText("Wrong Username or Password");
        }
        jdbc.close();*/

    }




    void setMain(Main main) {
        this.main = main;
    }

}
