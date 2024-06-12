package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Classes.Paciente;


public class PacienteImpl implements PacienteDao {

    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                "select * from paciente where nome like '% :? %'", Paciente.class)
                .setParameter(1, nome).getResultList();
    }

    @Override
    public Paciente existePaci(String nome) {
        List<Paciente> resultList = Dao.getInstace().getEm().createNativeQuery(
                "select * from paciente where nome like '% :? %'", Paciente.class)
                .setParameter(1, nome).getResultList();
        return !resultList.isEmpty()?resultList.get(0):null;
    }
}

