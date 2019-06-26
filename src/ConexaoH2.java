import java.net.ConnectException;
import java.sql.*;

public class ConexaoH2 {

    private final String JDBC_DRIVER = "org.h2.Driver";
    private final String URL = "jdbc:h2:~/test";

    private final String USER = "sa";
    private final String PASS = "";

    private Connection conn = null;
    private Statement st = null;
    private Object ResultSet;

    public ConexaoH2(){
        super();
        this.h2Connection();
        this.createTable();
    }

    private void h2Connection() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
            st = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }
    }

    private void createTable() {
        try {
            String sql = "CREATE TABLE   REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            st.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }
    }

    public void insert() {
        try {
            String sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 'Ali', 18)";

            st.executeUpdate(sql);
            sql = "INSERT INTO Registration " + "VALUES (101, 'Mahnaz', 'Fatma', 25)";

            st.executeUpdate(sql);
            sql = "INSERT INTO Registration " + "VALUES (102, 'Zaid', 'Khan', 30)";

            st.executeUpdate(sql);
            sql = "INSERT INTO Registration " + "VALUES(103, 'Sumit', 'Mittal', 28)";

            st.executeUpdate(sql);
            System.out.println("Inserted records into the table...");

            // STEP 4: Clean-up environment
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }
    }

    public void delet(){

        try{
        st = conn.createStatement();
        String sql = "DELETE FROM Registration " + "WHERE id = 101";
        st.executeUpdate(sql);

            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }
    }

    public void select (){
        try{
        st = conn.createStatement();
        String sql = "SELECT id, first, last, age FROM Registration";
            ResultSet rs = st.executeQuery(sql);


            // STEP 4: Extract data from result set
            while(rs.next()) {
                // Retrieve by column name
                int id  = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }

            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }

    }

    public void selectOne (){
        try{
            st = conn.createStatement();
            String sql = "SELECT first FROM Registration WHERE id=100";
            ResultSet rs = st.executeQuery(sql);

            // STEP 4: Extract data from result set
            while(rs.next()) {
                // Retrieve by column name
                String first = rs.getString("first");

                System.out.print(", First: " + first);

            }

            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }

    }

    public void upDate(){
        try{
        System.out.println("Connected database successfully...");
        st = conn.createStatement();
        String sql = "UPDATE Registration " + "SET age = 30 WHERE id in (100, 101,103)";
        st.executeUpdate(sql);

        // Now you can extract all the records
        // to see the updated records
        sql = "SELECT id, first, last, age FROM Registration";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            // Retrieve by column name
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");

            // Display values
            System.out.print("ID: " + id);
            System.out.print(", Age: " + age);
            System.out.print(", First: " + first);
            System.out.println(", Last: " + last);
    }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }

}

}
