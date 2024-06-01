
package unigran.br.projetoodonto;

public class Cidade {
    private int id;
    private String estado;
    private String nome;

    // Construtor, getters e setters
    public Cidade(int id, String estado, String nome) {
        this.id = id;
        this.estado = estado;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
