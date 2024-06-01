
package unigran.br.projetoodonto;

public class Consulta {
    private int id;
    private String observacao;
    private int anexosId;
    private Dentista dentista;
    private Paciente paciente;

    // Construtor, getters e setters
    public Consulta(int id, String observacao, int anexosId, Dentista dentista, Paciente paciente) {
        this.id = id;
        this.observacao = observacao;
        this.anexosId = anexosId;
        this.dentista = dentista;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getAnexosId() {
        return anexosId;
    }

    public void setAnexosId(int anexosId) {
        this.anexosId = anexosId;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
