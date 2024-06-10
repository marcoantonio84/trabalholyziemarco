
package unigran.br.projetoodonto.Cadastro;


import dto.DTO;
import dto.PacienteDTO;
import javax.swing.DefaultComboBoxModel;
import unigran.br.projetoodonto.Classes.UF;
import view.util.PainelInterface;


public class CadastroPaciente extends PainelInterface {

    public CadastroPaciente() {
        initComponents();
        jtEstado.setModel(new DefaultComboBoxModel(UF.values()));
    }

    
    @SuppressWarnings("unchecked")


   
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtContato;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JComboBox<String> jtEstado;
    private com.toedter.calendar.JDateChooser jtNasc;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtResponsavel;

    PacienteDTO p;
    
    @Override
    public DTO salvar() {
        if(p==null)
            p = new PacienteDTO();
        p.nomePaciente = jtNome.getText();
        p.cpfPaciente = jtCPF.getText();
        p.nascPaciente = jtNasc.getDate();
        p.estado = jtEstado.getSelectedItem().toString();
        p.cidade = jtCidade.getText();
        p.endereco = jtEndereco.getText();
        p.numero = jtNumero.getText();
        p.nomeResponsavel = jtResponsavel.getText();
        p.contato = jtContato.getText();
 
        return p;
        }

    @Override
    public void preencheCampos(DTO dto) {
        p = (PacienteDTO) dto;
        jtNome.setText(p.nomePaciente);
        jtCPF.setText(p.cpfPaciente);
        jtNasc.setDate(p.nascPaciente);
        jtEstado.setSelectedItem(p.estado);
        jtCidade.setText(p.cidade);
        jtEndereco.setText(p.endereco);
        jtNumero.setText(p.numero);
        jtResponsavel.setText(p.nomeResponsavel);
        jtContato.setText(p.contato);
    }

}
