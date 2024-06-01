
package unigran.br.projetoodonto;

public class Funcionario {
    private int id;
    private String nome;
    private String registro;
    private Login login;

    // Construtor, getters e setters
    public Funcionario(int id, String nome, String registro, Login login) {
        this.id = id;
        this.nome = nome;
        this.registro = registro;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
