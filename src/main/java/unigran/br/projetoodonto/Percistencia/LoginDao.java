package unigran.br.projetoodonto.Percistencia;

import Telas.Login;
import java.util.List;
import org.json.JSONObject;
import unigran.br.projetoodonto.Percistencia.Dao;
import unigran.br.projetoodonto.Percistencia.InterfaceDao;


public interface LoginDao extends InterfaceDao {

    public List<Login> listar();

    public void salvar(Object entidade) ;
    
    public boolean verificaExiste(JSONObject entidade);
}