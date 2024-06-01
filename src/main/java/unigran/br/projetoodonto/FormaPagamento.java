
package unigran.br.projetoodonto;

public class FormaPagamento {
    private int id;
    private String tipoPagamento;
    private double valor;
    private Consulta consulta;

    // Construtor, getters e setters
    public FormaPagamento(int id, String tipoPagamento, double valor, Consulta consulta) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valor = valor;
        this.consulta = consulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
