package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PSQL {
    public static ResultSet query(String queryLine)
    {
        Statement stmt = null;
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/"+"bikroyDB_2",
                            "postgres", "hr");

            c.setAutoCommit(false);
            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery( queryLine );



            return rs;

        } catch (Exception e) {
            return null;
        }
    }
}
