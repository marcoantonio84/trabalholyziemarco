
package unigran.br.projetoodonto.Percistencia;

import unigran.br.projetoodonto.Classes.Endereco;



public interface EnderecoDao extends InterfaceDao{
    public Endereco existeEnd (String nome);
    
}

