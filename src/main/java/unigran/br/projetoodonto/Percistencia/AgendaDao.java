
package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Classes.Paciente;
import unigran.br.projetoodonto.Percistencia.Dao;


public interface AgendaDao extends InterfaceDao {

    public List<Paciente> listar();
}