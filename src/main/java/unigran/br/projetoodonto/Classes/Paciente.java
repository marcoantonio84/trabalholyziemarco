package unigran.br.projetoodonto.Classes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


@Entity
public @Data class Paciente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column
    private String numCasa;
    @ManyToOne
    private Endereco endereco;
    @ManyToOne
    private Paciente responsavel;

    @OneToMany(mappedBy = "responsavel")
    private List<Paciente> pacientes;

    @OneToMany(mappedBy = "paciente")
    private List<Contato> contatos;    
    
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;
    
    @OneToMany(mappedBy = "paciente")
    private List<Prontuario> prontuarios;
}
