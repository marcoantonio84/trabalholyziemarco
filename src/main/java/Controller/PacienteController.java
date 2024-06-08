
package Controller;

import dto.DTO;
import dto.PacienteDTO;
import java.text.SimpleDateFormat;
import java.util.List;
import org.json.JSONObject;
import unigran.br.projetoodonto.Classes.Paciente;
import unigran.br.projetoodonto.Percistencia.PacienteDao;
import unigran.br.projetoodonto.Percistencia.PacienteImpl;


public class PacienteController implements Controller{
    
    PacienteDao dao = (PacienteDao) new PacienteImpl();
    
    @Override
    public String[] getTitulosColunas() {
        return new String[]{"Nome","Data de Nascimento", "CPF", "Nome do Responsavel", "Contato"};
    }

    @Override
    public void salvaDTO(DTO paciente) throws Exception {
        dao.atualiza(paciente.builder());
    }

    @Override
    public List getListaDados() {
        List<Paciente> dados = dao.listar(Paciente.class);
        PacienteDTO pacienteDTO = new PacienteDTO();
        return pacienteDTO.getListaDados(dados);
    }
    
    @Override
    public void removerDTO(DTO dto) {
        dao.remove(((PacienteDTO) dto).builder());
    }

    @Override
    public Object[] getDadosDTO(DTO o) {
        PacienteDTO dto = (PacienteDTO) o;
        return new Object[]{dto.nomePaciente, new SimpleDateFormat("dd/MM/yyyy").format(dto.nascPaciente), dto.cpfPaciente, dto.nomeResponsavel, dto.contato};
    }
    
    @Override
    public void remover(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public Object[] getDados(JSONObject func) {
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
