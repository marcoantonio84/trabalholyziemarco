
package unigran.br.projetoodonto.Classes;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
    

@Entity
public @Data class Cidade implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    
    private UF estado;
    
//    @OneToMany(mappedBy = "cidade", fetch = FetchType.LAZY)
//    private List<Endereco> endereco;
        
    
}
