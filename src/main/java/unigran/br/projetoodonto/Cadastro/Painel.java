
package unigran.br.projetoodonto.Cadastro;


import com.mycompany.clinicaodonto.dto.DTO;
import javax.swing.JPanel;

/**
 *
 * @author Beatriz
 */
public abstract class Painel extends JPanel{
    public abstract DTO salvar();
    public abstract void preencheCampos(DTO dto);    
    
}
