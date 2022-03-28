package sample;

import java.sql.*;

public class JDBC {
    public Connection con;
    public PreparedStatement pst;

    public JDBC(String name, String pass) throws SQLException {
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",name,pass);
    }
    public ResultSet executeQuery(String sql) throws SQLException{
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        return rs;
    }
    public void executeUpdate(String sql) throws SQLException{
        pst = con.prepareStatement(sql);
        pst.executeUpdate();
    }
    public void close() throws SQLException{con.close();pst.close();}
    String STR(String a){
        return "'"+ a + "'";
    }
}
