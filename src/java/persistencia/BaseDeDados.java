package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDados {

    private Connection conn;

    public BaseDeDados() {
    }

    public Connection conecta() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://consoles.mysql.dbaas.com.br/consoles";
            conn = DriverManager.getConnection(url, "consoles", "Anderson@1703");
            conn.setAutoCommit(true);
            System.out.println("Conectado!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void desconecta() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
