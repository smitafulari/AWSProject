package bank.management.system;
import java.sql.*;

public class Conn {

    public Connection c;
    public Statement s;

    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "codeforinterview");
            s = c.createStatement();
        } catch (SQLException e) {
            // Handle the exception or log it
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return c;
    }

    public Statement getStatement() {
        return s;
    }

    public void close() {
        try {
            if (s != null) {
                s.close();
            }
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            // Handle the exception or log it
            e.printStackTrace();
        }
    }
}
