package unigran.br.projetoodonto.Classes;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Data;

@Entity
public  class Dentista extends Funcionario implements Serializable{
    
    private String cro;

}
