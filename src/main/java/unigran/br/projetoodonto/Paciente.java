
package unigran.br.projetoodonto;

public class Paciente {
    private int id;
    private String dataNascimento;
    private String cpf;
    private String nome;
    private String numeroCasa;
    private Endereco endereco;
    private Paciente responsavel;

    // Construtor, getters e setters
    public Paciente(int id, String dataNascimento, String cpf, String nome, String numeroCasa, Endereco endereco, Paciente responsavel) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.nome = nome;
        this.numeroCasa = numeroCasa;
        this.endereco = endereco;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Paciente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Paciente responsavel) {
        this.responsavel = responsavel;
    }
}
