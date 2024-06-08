package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Percistencia.Dao;
import unigran.br.projetoodonto.Classes.Paciente;


public interface PacienteDao extends InterfaceDao{
    public  List listarbyNome(String nome);
    public Paciente existePaci(String nome);
}
