
package unigran.br.projetoodonto;

public class Funcao {
    private int id;
    private String descricao;
    private String nome;

    // Construtor, getters e setters
    public Funcao(int id, String descricao, String nome) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
