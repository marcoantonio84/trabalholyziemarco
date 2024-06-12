package Telas;

import Controller.ConsultasController;
import Controller.FuncionarioController;
import Controller.LoginController;
import Controller.MateriaisController;
import Controller.PacienteController;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import unigran.br.projetoodonto.Cadastro.Cadastro;
import unigran.br.projetoodonto.Cadastro.Listagem;
import unigran.br.projetoodonto.Cadastro.CadastroConsulta;
import unigran.br.projetoodonto.Cadastro.CadastroFuncionario;
import unigran.br.projetoodonto.Cadastro.CadastroLogin;
import unigran.br.projetoodonto.Cadastro.CadastroMateriais;
import unigran.br.projetoodonto.Cadastro.CadastroPaciente;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        // Configure the look and feel
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Create the main panel
        JPanel jPanel1 = new JPanel();
        
        // Create the menu bar
        JMenuBar jMenuBar1 = new JMenuBar();
        
        // Menu items
        JMenu jMenu1 = new JMenu("Funcionarios");
        JMenuItem cadFuncionario = new JMenuItem("Cadastro");
        JMenuItem cadLogin = new JMenuItem("Usuario Sistema");
        JMenuItem consFuncionario = new JMenuItem("Consulta");
        
        JMenu jMenu2 = new JMenu("Pacientes");
        JMenuItem cadPaciente = new JMenuItem("Cadastro");
        JMenuItem consPaciente = new JMenuItem("Consulta");

        JMenu jMenu3 = new JMenu("Materiais");
        JMenuItem cadMateriais = new JMenuItem("Cadastro");
        JMenuItem consMateriais = new JMenuItem("Consulta");

        JMenu jMenu5 = new JMenu("Consultas");
        JMenuItem cadConsulta = new JMenuItem("Cadastro");

        // Add action listeners
        cadFuncionario.addActionListener(evt -> new Cadastro(null, true, new CadastroFuncionario(), new FuncionarioController()).setVisible(true));
        cadLogin.addActionListener(evt -> new Cadastro(null, true, new CadastroLogin(), new LoginController()).setVisible(true));
        consFuncionario.addActionListener(evt -> new Listagem(this, new CadastroFuncionario(), new FuncionarioController()).setVisible(true));
        cadPaciente.addActionListener(evt -> new Cadastro(null, true, new CadastroPaciente(), new PacienteController()).setVisible(true));
        consPaciente.addActionListener(evt -> new Listagem(this, new CadastroPaciente(), new PacienteController()).setVisible(true));
        cadMateriais.addActionListener(evt -> new Cadastro(null, true, new CadastroMateriais(), new MateriaisController()).setVisible(true));
        consMateriais.addActionListener(evt -> new Listagem(this, new CadastroMateriais(), new MateriaisController()).setVisible(true));
        cadConsulta.addActionListener(evt -> new Cadastro(null, true, new CadastroConsulta(), new ConsultasController()).setVisible(true));

        // Add menu items to menus
        jMenu1.add(cadFuncionario);
        jMenu1.add(cadLogin);
        jMenu1.add(consFuncionario);
        
        jMenu2.add(cadPaciente);
        jMenu2.add(consPaciente);

        jMenu3.add(cadMateriais);
        jMenu3.add(consMateriais);

        jMenu5.add(cadConsulta);

        // Add menus to the menu bar
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu5);

        // Set the menu bar
        setJMenuBar(jMenuBar1);

        // Main panel layout
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        // Set the main layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        // Pack the components
        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new MenuPrincipal();
            frame.setVisible(true);
        });
    }
}
