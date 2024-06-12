package Telas;

import Controller.ConsultasController;
import Controller.FuncaoController;
import Controller.MateriaisController;
import Controller.PacienteController;
import unigran.br.projetoodonto.Classes.Paciente;
import unigran.br.projetoodonto.Percistencia.Dao;
import unigran.br.projetoodonto.Cadastro.Cadastro;
import unigran.br.projetoodonto.Cadastro.CadastroConsulta;
import unigran.br.projetoodonto.Cadastro.CadastroFuncionario;
import unigran.br.projetoodonto.Cadastro.CadastroPaciente;
import unigran.br.projetoodonto.Cadastro.CadastroMateriais;
import Telas.Login;

public class ClinicaOdonto {

    public static void main(String[] args) {
//        Dao.getInstace().listar(Paciente.class, "");
        new Cadastro(null, true, new CadastroConsulta(), new ConsultasController()).setVisible(true);
//         Login.main(args);
    }
}