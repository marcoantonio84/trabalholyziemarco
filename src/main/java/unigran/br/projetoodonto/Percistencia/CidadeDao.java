
package unigran.br.projetoodonto.Percistencia;

import unigran.br.projetoodonto.Classes.Cidade;
import unigran.br.projetoodonto.Percistencia.Dao;


public interface CidadeDao extends InterfaceDao{
    public Cidade existeCid(String nome);
}