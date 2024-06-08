
package unigran.br.projetoodonto.Percistencia;

import unigran.br.projetoodonto.Classes.Paciente;
import java.util.List;
import unigran.br.projetoodonto.Percistencia.Dao;


public interface ConsultaDao extends InterfaceDao{
    public  List listarbyPaciente(String nome);
}