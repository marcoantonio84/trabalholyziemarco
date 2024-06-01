
package unigran.br.projetoodonto;

public class Arquivos {
    private int id;
    private String carrinhoArquivo;

    // Construtor, getters e setters
    public Arquivos(int id, String carrinhoArquivo) {
        this.id = id;
        this.carrinhoArquivo = carrinhoArquivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrinhoArquivo() {
        return carrinhoArquivo;
    }

    public void setCarrinhoArquivo(String carrinhoArquivo) {
        this.carrinhoArquivo = carrinhoArquivo;
    }
}

