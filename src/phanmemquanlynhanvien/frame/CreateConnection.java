package phanmemquanlynhanvien.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateConnection {
    
    private Connection connection;
    private Statement statement;
    
    private String  url = "jdbc:mysql://localhost:3306/employeesmanagementdatabase",
                    userName = "root",
                    password = "phungsobuda";
    
    public CreateConnection(){
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection(url, userName, password);
             statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
