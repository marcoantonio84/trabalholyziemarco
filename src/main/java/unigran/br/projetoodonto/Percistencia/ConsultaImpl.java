
package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Classes.Consulta;
import unigran.br.projetoodonto.Percistencia.Dao;


public class ConsultaImpl implements ConsultaDao{

     @Override
    public List listarbyPaciente(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                 "select * from consulta where paciente like '% :? %'",Consulta.class)
                .setParameter(1,nome).getResultList();
    }
    
}

