
package Controller;

import dto.ConsultaDTO;
import dto.DTO;
import java.util.List;
import org.json.JSONObject;
import unigran.br.projetoodonto.Classes.Consulta;
import unigran.br.projetoodonto.Percistencia.ConsultaDao;
import unigran.br.projetoodonto.Percistencia.ConsultaImpl;


public class ConsultasController implements Controller{

    ConsultaDao dao = new ConsultaImpl();
    
    @Override
    public void salvaDTO(DTO dto) throws Exception {
        dao.atualiza(dto.builder());
    }

    @Override
    public void removerDTO(DTO dto) {
        dao.remove(((ConsultaDTO) dto).builder());
    }

    @Override
    public Object[] getDadosDTO(DTO o) {
        ConsultaDTO dto = (ConsultaDTO) o;
        return new Object[]{dto.id, dto.nomePaciente, dto.obs, dto.anexos, dto.nomeDentista, dto.pagamento};
    }
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome do Paciente", "Observacoes", "Anexos", "Dentista", "Froma de pagamento"};
    }
    
    @Override
    public List getListaDados() {
        List<Consulta> dados = dao.listar(Consulta.class);
        ConsultaDTO consultaDTO = new ConsultaDTO();
        return  consultaDTO.getListaDados(dados);
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
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
