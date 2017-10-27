import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Statements {

    //    Declare a Statement
    private static Statement stmt = null;

    //    Declare a connection
    private static Connection con = DB_Connector.connect();

    //    Method to create a new Database
    public void createNewDB() {

        //    SQL statement
        String query = "create database if not exists ThisDatabase";

        try {

//    connection
            stmt = con.createStatement();

//    execute statement
            stmt.executeUpdate(query);
            System.out.println("\n--Database created--");
        } catch (SQLException ex) {
//    handle sql exceptions

            System.out.println("\n--Statement did not execute--");
            ex.printStackTrace();

        }
    }
}