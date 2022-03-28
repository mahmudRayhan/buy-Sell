package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.ResultSet;

public class Main extends Application {
    Stage stage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Stage is the GUI that is shown after running the program.
        stage = primaryStage;
        showHomePage();
    }
    public void showHomePage() throws Exception{
        //Xml loading using FXMLLoader
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("HomePage.fxml"));
        Parent root=loader.load();

        HomePageController controller = loader.getController();
        //controller.setNc(nc);
        //controller.setName(name);
        controller.setMain(this);

        //set the primary stage
        stage.setTitle("Bikroy.com");
        stage.setScene(new Scene(root,900,650));
        stage.show();

    }

    public void showHomePage_2() throws Exception{
        //Xml loading using FXMLLoader
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("HomePage_2.fxml"));
        Parent root=loader.load();

        HomePage_2Controller controller = loader.getController();
        //controller.setNc(nc);
        //controller.setName(name);
        controller.setMain(this);

        //set the primary stage
        stage.setTitle("Bikroy.com");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void showLoginPage() throws Exception{
        //Xml loading using FXMLLoader
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginPage.fxml"));
        Parent root=loader.load();

        // Loading the controller
        LoginPageController controller = loader.getController();
        controller.setMain(this);

        //set the primary stage
        stage.setTitle("Login Page");
        stage.setScene(new Scene(root,700,350));
        stage.show();

    }


    public void showResultDemo(ResultSet rs) throws Exception{
        //Xml loading using FXMLLoader
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("showResultDemo.fxml"));
        Parent root=loader.load();

        // Loading the controller
        showResultDemoController controller = loader.getController();
        controller.setMain(this , rs);

        //controller.setRs(rs);
        //for printing query

        //String str="";
        String [] rows=new String [20];
        int count=0;

        while ( rs.next() ) {

            //System.out.println("inside the rs");
            String id =String.valueOf( rs.getString(1) );


            //str=id+" "+name;
            rows[count]=id+"";
            count++;


        }


        String str=new String();

        for(int i=0;i<count;i++){
            str=str+rows[i]+" \n";
        }

       // str=str+"";

        controller.showResult.setText(str);


        //end here




        //set the primary stage
        stage.setTitle("showResultDemo");
        stage.setScene(new Scene(root,800,600));
        stage.show();

    }




    public void showResultDemo_11(ResultSet rs) throws Exception{
        //Xml loading using FXMLLoader
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("showResultDemo.fxml"));
        Parent root=loader.load();

        // Loading the controller
        showResultDemoController controller = loader.getController();
        controller.setMain(this , rs);

        //controller.setRs(rs);
        //for printing query

        //String str="";
        String [] rows=new String [20];
        int count=0;

        while ( rs.next() ) {

            //System.out.println("inside the rs");
            String id =String.valueOf( rs.getString(1) );


            //str=id+" "+name;
            rows[count]=id+"";
            count++;


        }


        String str=new String();

        for(int i=0;i<count;i++){
            str=str+rows[i]+" \n";
        }

        // str=str+"";

        controller.showResult.setText(str);


        //end here




        //set the primary stage
        stage.setTitle("showResultDemo");
        stage.setScene(new Scene(root));
        stage.show();

    }




    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/




    public static void main(String[] args) {
        launch(args);
    }
}
