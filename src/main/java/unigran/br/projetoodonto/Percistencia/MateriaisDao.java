package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Percistencia.InterfaceDao;


public interface MateriaisDao extends InterfaceDao{
    public  List listarbyNome(String nome);
}