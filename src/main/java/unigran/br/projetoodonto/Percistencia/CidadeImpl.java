
package unigran.br.projetoodonto.Percistencia;


import unigran.br.projetoodonto.Classes.Cidade;
import unigran.br.projetoodonto.Percistencia.Dao;


public class CidadeImpl implements CidadeDao{

    @Override
    public Cidade existeCid(String nome) {
        return  (Cidade) Dao.getInstace().getEm().createNativeQuery(
                 "select * from Cidade where nome=:nome",Cidade.class)
                .setParameter("nome",nome).getSingleResult();
    }
    
}
