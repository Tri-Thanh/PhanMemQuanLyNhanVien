package phanmemquanlynhanvien.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class KetNoiDatabase {
    public Connection connection;
    public Statement statement;
    
    private String url = "jdbc:mysql://localhost:3306/quanlynhanvien";
    private String userName = "root";
    private String password = "phungsobuda";
    
    public KetNoiDatabase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Statement getStatement(){
        return statement;
    }
}
