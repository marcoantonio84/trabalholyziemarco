
package unigran.br.projetoodonto.Classes;

public class Principal {
    public static void main(String[] args) {
        // Criando instâncias de Cidade e Endereco
        Cidade cidade = new Cidade(1, "SP", "São Paulo");
        Endereco endereco = new Endereco(1, "Rua das Flores", cidade);

        // Criando uma instância de Paciente
        Paciente paciente = new Paciente(1, "01/01/1990", "123.456.789-00", "João Silva", "123", endereco, null);

        // Criando uma instância de Dentista
        Dentista dentista = new Dentista(1, "Dr. Pedro Souza", "987.654.321-00", "11987654321", "12345");

        // Criando uma instância de Consulta
        Consulta consulta = new Consulta(1, "Primeira consulta", 0, dentista, paciente);

        // Exibindo os dados da consulta
        System.out.println("Consulta ID: " + consulta.getId());
        System.out.println("Observação: " + consulta.getObservacao());
        System.out.println("Dentista: " + consulta.getDentista().getNome());
        System.out.println("Paciente: " + consulta.getPaciente().getNome());
    }
}

