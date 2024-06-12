
package unigran.br.projetoodonto.Classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class Consulta implements Serializable {

    @OneToOne(mappedBy = "consulta_id")
    private FormaPagamento formaPagamento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String observacao;


    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Funcionario dentista;
    

    @OneToMany(mappedBy = "consulta")
    private List<Prontuarios> prontuarios;
}