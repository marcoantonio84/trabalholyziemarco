package dto;


import java.util.LinkedList;
import java.util.List;
import unigran.br.projetoodonto.Classes.Login;


public class LoginDTO extends DTO{
    public String usuario;
    public String senha;
    public int funcao;


    @Override
    public Login builder(){
        Login login = new Login();
        login.setUsuario(usuario);
        login.setSenha(senha);
        login.setFuncao(funcao);
        return login;
    }
    
    public List getListaDados(List<Login> dados) {
        List dadosDTO = new LinkedList();
        for (Login dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Login f) {
        
        LoginDTO dto= new LoginDTO();
        dto.usuario=f.getUsuario();
        dto.senha=f.getSenha();
        dto.funcao=f.getFuncao();
        return dto;
    }
    
}