package entidade;

public class Cadastro {

    private int codigo;
    private String primeiroNome;
    private String segundoNome;
    private String endereco;
    private String endNum;
    private String cidade;
    private String uf;
    private String email;

    public Cadastro() {
    }

    public Cadastro(int codigo, String primeiroNome, String segundoNome, 
            String endereco, String endNum, String cidade, String uf, String email) {
        this.codigo = codigo;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.endereco = endereco;
        this.endNum = endNum;
        this.cidade = cidade;
        this.uf = uf;
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndNum() {
        return endNum;
    }

    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    

   
}