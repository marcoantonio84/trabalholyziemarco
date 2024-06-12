
package unigran.br.projetoodonto.Percistencia;


import java.util.List;
import unigran.br.projetoodonto.Classes.Cidade;
import unigran.br.projetoodonto.Percistencia.Dao;


public class CidadeImpl implements CidadeDao{

    @Override
    public Cidade existeCid(String nome) {
        List<Cidade> resultList = Dao.getInstace().getEm().createNativeQuery(
                "select * from cidade ",Cidade.class)
                .getResultList();
        return !resultList.isEmpty()?resultList.get(0):null;
    }
    
}
