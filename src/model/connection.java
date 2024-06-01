package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connection {

    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnway", "root", "Abcd!234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) throws Exception{
    
        Statement statement = connection.createStatement();
        
        if(query.startsWith("SELECT")){
        return statement.executeQuery(query);
        }else{
        statement.executeUpdate(query);
        return null;
        }
        
    }
}
