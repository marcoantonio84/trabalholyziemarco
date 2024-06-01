
package unigran.br.projetoodonto;

public class Prontuario {
    private int id;
    private Paciente paciente;

    // Construtor, getters e setters
    public Prontuario(int id, Paciente paciente) {
        this.id = id;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
