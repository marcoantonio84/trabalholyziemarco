package unigran.br.projetoodonto.Percistencia;

import unigran.br.projetoodonto.Classes.Funcionario;
import java.util.List;
import unigran.br.projetoodonto.Percistencia.Dao;


public class FuncionarioImpl implements FuncionarioDao {
    
    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                 "select * from funcionario where nome like '% :? %'",Funcionario.class)
                .setParameter(1,nome).getResultList();
    }
}
