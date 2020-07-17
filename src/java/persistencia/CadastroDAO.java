package persistencia;

import entidade.Cadastro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CadastroDAO {

    private PreparedStatement pstm;
    private ResultSet rs;
    private BaseDeDados bd;
    private Cadastro cadObj;
    private String SQLvalidaCadastro = "SELECT * FROM games";

    public CadastroDAO() {
    }

    public boolean validaCadastro(String primeiroNome, String segundoNome, String endereco,
            String endNum, String cidade, String uf, String email) {
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(SQLvalidaCadastro);
            pstm.setString(1, primeiroNome);
            pstm.setString(2, segundoNome);
            pstm.setString(3, endereco);
            pstm.setString(4, endNum);
            pstm.setString(5, cidade);
            pstm.setString(6, uf);
            pstm.setString(7, email);
            
            rs = pstm.executeQuery();

            if (rs.next()) {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean cadastro(Cadastro cadObj) {
        try {
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement("INSERT INTO games(PrimeiroNome, SegundoNome, Endereco, EndNum, Cidade, UF, Email) VALUES (?,?,?,?,?,?,?)");
            pstm.setString(1, cadObj.getPrimeiroNome());
            pstm.setString(2, cadObj.getSegundoNome());
            pstm.setString(3, cadObj.getEndereco());
            pstm.setString(4, cadObj.getEndNum());
            pstm.setString(5, cadObj.getCidade());
            pstm.setString(6, cadObj.getUf());
            pstm.setString(7, cadObj.getEmail());
            

            pstm.executeUpdate();
            bd.desconecta();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        

    }
}
