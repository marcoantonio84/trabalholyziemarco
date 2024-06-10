
package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Percistencia.Dao;
import unigran.br.projetoodonto.Percistencia.InterfaceDao;
import unigran.br.projetoodonto.Classes.Funcao;

public interface FuncaoDao extends InterfaceDao {

    public List<Funcao> listar();

    @Override
    public default void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }
}