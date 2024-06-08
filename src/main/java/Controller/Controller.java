
package Controller;

import dto.DTO;
import java.util.List;
import org.json.JSONObject;


public interface Controller {

    public String[] getTitulosColunas();//colunas matriz

    public Object[] getDados(JSONObject func);//array matriz

    public List getListaDados();//lista de dados 

    public void remover(JSONObject func);

    public boolean verificaExiste(JSONObject func) throws Exception;

    public void salvar(JSONObject func) throws Exception;

    public void salvaDTO (DTO dto) throws Exception;
    
    public void removerDTO (DTO dto);
    
    public Object[] getDadosDTO(DTO dto);//array matriz
}
