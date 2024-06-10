package Controller;

import dto.DTO;
import org.json.JSONObject;
import java.util.List;
import lombok.Data;
import unigran.br.projetoodonto.Classes.Login;
import unigran.br.projetoodonto.Percistencia.LoginDao;
import unigran.br.projetoodonto.Percistencia.LoginImpl;


@Data
public class LoginController implements Controller {

    LoginDao dao = new LoginImpl();

    @Override
    public void salvar(JSONObject func) throws Exception {
        dao.salvar(builderJSOn(func));
    }

    @Override
    public boolean verificaExiste(JSONObject func) throws Exception {
        return dao.verificaExiste(func);
    }

    private Object builderJSOn(JSONObject func) {
        Login login = new Login();
        login.setSenha(func.get("pass").toString());
        login.setUsuario(func.get("nomelogin").toString());
        login.setFuncao((int) func.get("tipoUsuario"));
        System.out.println(login);
        return login;
    }

    @Override
    public String[] getTitulosColunas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDados(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List getListaDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remover(JSONObject func) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void salvaDTO(DTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerDTO(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] getDadosDTO(DTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}