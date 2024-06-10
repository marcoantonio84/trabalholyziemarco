package dto;


import unigran.br.projetoodonto.Classes.Paciente;
import unigran.br.projetoodonto.Percistencia.Dao;



public class ClinicaOdonto {

    public static void main(String[] args) {
       Dao.getInstace().listar(Paciente.class, "");       // new Cadastro(null, true,new CadastroFuncionario(), new FuncaoController()).setVisible(true);
       // Login.main(args);
    }
}
