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
        return (Paciente) Dao.getInstace().getEm().createNativeQuery(
                 "select * from Paciente where nome",Paciente.class)
                .setParameter("nome",nome).getSingleResult();}

}

