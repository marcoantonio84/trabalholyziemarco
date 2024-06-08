package dto;

import java.util.LinkedList;
import java.util.List;
import unigran.br.projetoodonto.Classes.Materiais;


public class MateriaisDTO extends DTO{
    public String nome;
    public Integer qtd;
    

    @Override
    public Object builder() {
        Materiais material = new Materiais();
        material.setId(id!=null?Long.valueOf(id):0l);
        material.setNome(nome);
        material.setQtd(qtd);
        return material;
    }
    
    
    public List getListaDados(List<Materiais> dados) {
        List dadosDTO = new LinkedList();
        for (Materiais dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Materiais m) {
        
        MateriaisDTO dto= new MateriaisDTO();
        
        dto.id=m.getId().toString();
        dto.nome=m.getNome();
        dto.qtd=m.getQtd();        
        return dto;
    }
}
