package Telas;

import Controller.Controller;
import Controller.LoginController;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

public class Login extends JFrame {

    private JTextField txLogin;
    private JPasswordField txPass;
    private JComboBox<String> mdTipoUsuario;
    private JButton btnNovo;
    private JButton btnEntrar;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();

        txLogin = new JTextField(20);
        txPass = new JPasswordField(20);
        mdTipoUsuario = new JComboBox<>(new String[]{"Atendente", "Dentista"});
        btnNovo = new JButton();
        btnEntrar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuário");
        jLabel2.setText("Senha");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(this::btnNovoActionPerformed);

        btnEntrar.setText("Acessar");
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(txPass)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnNovo)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrar))
                        .addComponent(txLogin)
                        .addComponent(mdTipoUsuario, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(jLabel1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(mdTipoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo)
                        .addComponent(btnEntrar))
                    .addContainerGap(70, Short.MAX_VALUE))
        );

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

        pack();
    }

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {
        JSONObject func = new JSONObject();
        func.put("nomelogin", txLogin.getText());
        func.put("pass", new String(txPass.getPassword())); // Converta char[] para String de forma segura
        func.put("tipoUsuario", mdTipoUsuario.getSelectedIndex());
        Controller controller = new LoginController();

        try {
            controller.salvar(func);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
        JSONObject func = new JSONObject();
        func.put("nomelogin", txLogin.getText());
        func.put("pass", new String(txPass.getPassword())); // Converta char[] para String de forma segura
        func.put("tipoUsuario", mdTipoUsuario.getSelectedIndex());
        Controller controller = new LoginController();

        try {
            boolean acesso = controller.verificaExiste(func);
            if (acesso) {
                JOptionPane.showMessageDialog(null, "BEM VINDO");
                dispose();
                MenuPrincipal.main(new String[0]);
            } else {
                JOptionPane.showMessageDialog(null, "ACESSO NEGADO");
            }
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new Login();
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
