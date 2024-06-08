package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Percistencia.Dao;
import unigran.br.projetoodonto.Classes.Materiais;


public class MateriaisImpl implements MateriaisDao{

    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                 "select * from materiais where nome like '% :? %'",Materiais.class)
                .setParameter(1,nome).getResultList();}
    
}
