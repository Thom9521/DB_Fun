import java.sql.Connection;

public class Test_DB_C {
    public static void main(String[] args) {
       // Connection con = DB_Connector.connect();
        DB_Statements stmts = new DB_Statements();
        //stmts.createNewDB();
        stmts.useDB("ThisDatabase");
        stmts.createTable("MyTable");
    }
}
