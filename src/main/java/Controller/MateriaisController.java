package Controller;

import dto.DTO;
import dto.MateriaisDTO;
import java.util.List;
import org.json.JSONObject;
import unigran.br.projetoodonto.Classes.Materiais;
import unigran.br.projetoodonto.Percistencia.MateriaisDao;
import unigran.br.projetoodonto.Percistencia.MateriaisImpl;


public class MateriaisController implements Controller{
    
    MateriaisDao dao = new MateriaisImpl();

    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome", "Quantidade"};
    }
    
    @Override
    public Object[] getDados(DTO o) {
        MateriaisDTO dto = (MateriaisDTO) o;
        return new Object[]{dto.id, dto.nome, dto.qtd};
    }
    
    @Override
    public List getListaDados() {
        List<Materiais> dados = dao.listar(Materiais.class);
        MateriaisDTO materiaisDTO = new MateriaisDTO();
        return materiaisDTO.getListaDados(dados);
    }
    
    @Override
    public void salva(DTO dto) throws Exception {
        dao.atualiza(dto.builder());
    }

    @Override
    public void remover(DTO dto) {
        dao.remove(((MateriaisDTO) dto).builder());
    }
    
    @Override
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salvar(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}