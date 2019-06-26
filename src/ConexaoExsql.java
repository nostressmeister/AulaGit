import java.sql.*;

public class ConexaoExsql {

    private final String JDBC_DRIVER = "org.h2.Driver";
    private final String URL = "jdbc:h2:~/test";

    private final String USER = "sa";
    private final String PASS = "";

    private Connection conn = null;
    private Statement st = null;
    private Object ResultSet;

    public ConexaoExsql() {
        super();
        this.exConection();
        this.createTable();
    }

    public void exConection() {
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
            String sql = "CREATE TABLE   TABELAPRODUTO " +
                    "(id INTEGER not NULL, " +
                    "(id_nf INTEGER not NULL, " +
                    " id_item INTEGER not NULL, " +
                    " cod_prod INTEGER not NULL, " +
                    " valor_unit DOUBLE, " +
                    " quantidade INTEGER not NULL, " +
                    " desconto DOUBLE , " +
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

            String sql = "INSERT INTO (tabelaproduto)" + "VALUES (100,1,1,1,25.00,10,5),(101,1,2,2,13.50,3,null)";

            st.executeUpdate(sql);
            sql = "INSERT INTO (tabelaproduto)" + "VALUES (100,1,1,1,25.00,10,5),(101,1,2,2,13.50,3,null)";

            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }

    }

    //a) Pesquise os itens que foram vendidos sem desconto.
    //As colunas presentes no resultado da consulta são: ID_NF, ID_ITEM, COD_PROD E VALOR_UNIT.

    public void select() {
        try {
            st = conn.createStatement();
            String sql = "SELECT id_nf, id_item, cod_prod, valor_unit FROM tabelaproduto where desconto = null ";
            java.sql.ResultSet rs = st.executeQuery(sql);

            int id_nf = rs.getInt("id_nf");
            int id_item = rs.getInt("id_item");
            int cod_prod = rs.getInt("cod_prod");
            double valor_unit = rs.getDouble("valor_unit");


            System.out.print("ID NF: " + id_nf);
            System.out.print(", ID Item: " + id_item);
            System.out.print(", Código Produto: " + cod_prod);
            System.out.println(", Valor unitário: " + valor_unit);

            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando sql. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão. " + e.getMessage());
        }

    }
}
