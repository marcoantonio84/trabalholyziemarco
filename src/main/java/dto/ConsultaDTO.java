package dto;

import java.util.LinkedList;
import java.util.List;
import unigran.br.projetoodonto.Classes.Consulta;


public class ConsultaDTO extends DTO{
    public String nomePaciente;
    public String obs;
    public String anexos;
    public String nomeDentista;
    public String pagamento;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id!=null?Long.valueOf(id):0l);
        // buscar paciente consulta.setPaciente(paciente);
        consulta.setObservacao(obs);
        //consulta.setAnexos(anexos);
        //consulta.setDentista(dentista);
        //consulta.setFormaPagamentos(formaPagamentos);
        return consulta;
    }
    
        
    public List getListaDados(List<Consulta> dados) {
        List dadosDTO = new LinkedList();
        for (Consulta dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Consulta c) {
        
        ConsultaDTO dto= new ConsultaDTO();
        
        dto.id=c.getId().toString();
        //dto.nomePaciente.=c.getPaciente();
        dto.obs= c.getObservacao();
        //dto.anexos=c.getAnexos();
        //dto.nomeDentista=c.getDentista();
        //dto.pagamento=c.getFormaPagamentos();
        
        return dto;
    }
    

}
