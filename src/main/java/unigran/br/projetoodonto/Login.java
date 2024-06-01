
package unigran.br.projetoodonto;

public class Login {
    private int id;
    private String senha;
    private String usuario;
    private Funcionario funcionario;

    // Construtor, getters e setters
    public Login(int id, String senha, String usuario, Funcionario funcionario) {
        this.id = id;
        this.senha = senha;
        this.usuario = usuario;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
