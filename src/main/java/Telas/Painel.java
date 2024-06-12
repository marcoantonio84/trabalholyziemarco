package Telas;


import dto.DTO;
import javax.swing.JPanel;


public abstract class Painel extends JPanel{
    public abstract DTO salvar();
    public abstract void preencheCampos(DTO dto);    
    
}
