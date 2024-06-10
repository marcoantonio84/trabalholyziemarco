package unigran.br.projetoodonto.Classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data public class Prontuario implements Serializable{

    @OneToOne(mappedBy = "prontuario")
    private Prontuarios prontuarios;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    private Paciente paciente;
    
}