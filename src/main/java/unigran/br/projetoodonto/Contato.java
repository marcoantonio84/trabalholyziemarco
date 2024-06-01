
package unigran.br.projetoodonto;

public class Contato {
    private int id;
    private String informacao;
    private String tipo;
    private Paciente paciente;

    // Construtor, getters e setters
    public Contato(int id, String informacao, String tipo, Paciente paciente) {
        this.id = id;
        this.informacao = informacao;
        this.tipo = tipo;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

