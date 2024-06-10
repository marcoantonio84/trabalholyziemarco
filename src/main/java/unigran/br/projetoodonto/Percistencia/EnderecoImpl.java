package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Classes.Endereco;


public class EnderecoImpl implements EnderecoDao{

    @Override
    public Endereco existeEnd(String nome) {
        List<Endereco> resultList = Dao.getInstace().getEm().createNativeQuery(
                "select * from endereco  ",Endereco.class)
                .getResultList();
        return !resultList.isEmpty()?resultList.get(0):null;
    }
    
}