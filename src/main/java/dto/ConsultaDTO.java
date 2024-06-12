package dto;

import Controller.PacienteController;
import java.util.LinkedList;
import java.util.List;
import unigran.br.projetoodonto.Cadastro.Cadastro;
import unigran.br.projetoodonto.Cadastro.CadastroPaciente;
import unigran.br.projetoodonto.Classes.Consulta;
import unigran.br.projetoodonto.Classes.FormaPagamento;
import unigran.br.projetoodonto.Classes.Funcionario;
import unigran.br.projetoodonto.Classes.Paciente;
import unigran.br.projetoodonto.Classes.TipoPagamento;
import unigran.br.projetoodonto.Percistencia.FuncionarioDao;
import unigran.br.projetoodonto.Percistencia.FuncionarioImpl;
import unigran.br.projetoodonto.Percistencia.PacienteDao;
import unigran.br.projetoodonto.Percistencia.PacienteImpl;
import unigran.br.projetoodonto.Percistencia.PagamentoDao;
import unigran.br.projetoodonto.Percistencia.PagamentoImpl;


public class ConsultaDTO extends DTO{
    public String nomePaciente;
    public String obs;
    public String nomeDentista;
    public String valor;
    public String formaPag;

    @Override
    public Object builder() {
        Consulta consulta = new Consulta();
        consulta.setId(id!=null?Long.valueOf(id):0l);
        PacienteDao paciDao = new PacienteImpl();
        Paciente paci = paciDao.existePaci(nomePaciente);
        if(paci == null){
            new Cadastro(null, true, new CadastroPaciente(), new PacienteController()).setVisible(true);
        }
        consulta.setPaciente(paci);        
        consulta.setObservacao(obs);
        FuncionarioDao dentDao = new FuncionarioImpl(); 
        Funcionario dent = dentDao.existePaci(nomeDentista);
        consulta.setDentista(dent);
        FormaPagamento pag = new FormaPagamento();
        PagamentoDao pagDao = new PagamentoImpl();
        pag.setValor(Double.valueOf(valor));
        pag.setTipo_pagamento(TipoPagamento.valueOf(formaPag));
        pagDao.salvar(pag);
        consulta.setFormaPagamento(pag);
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
        dto.nomePaciente=c.getPaciente().getNome();
        dto.obs= c.getObservacao();
        dto.nomeDentista=c.getDentista().getNome();
        dto.valor=c.getFormaPagamento().getValor().toString();
        dto.formaPag=c.getFormaPagamento().toString();
        
        return dto;
    }
    

}