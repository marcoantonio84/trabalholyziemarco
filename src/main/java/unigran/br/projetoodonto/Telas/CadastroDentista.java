
package unigran.br.projetoodonto.Telas;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import unigran.br.projetoodonto.Dentista;

public class CadastroDentista extends JFrame {

    private JLabel lblCpf, lblNome, lblEspecialidade, lblTitulo;
    private JTextField txtCpf, txtNome, txtEspecialidade;
    private JButton btnSalvar, btnCancelar;

    public CadastroDentista() {
        initComponents();
    }

    private void initComponents() {
        // Definindo o layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Inicializando componentes
        lblTitulo = new JLabel("Cadastro de Dentista");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);

        lblCpf = new JLabel("CPF:");
        txtCpf = new JTextField(20);

        lblEspecialidade = new JLabel("Especialidade:");
        txtEspecialidade = new JTextField(20);

        btnSalvar = new JButton("Salvar");
        btnCancelar = new JButton("Cancelar");

        // Definindo ações dos botões
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarDentista();
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Adicionando componentes ao layout
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        gbc.gridwidth = 1;
        gbc.gridy++;
        add(lblNome, gbc);
        gbc.gridx++;
        add(txtNome, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(lblCpf, gbc);
        gbc.gridx++;
        add(txtCpf, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(lblEspecialidade, gbc);
        gbc.gridx++;
        add(txtEspecialidade, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnSalvar, gbc);
        gbc.gridy++;
        add(btnCancelar, gbc);

        pack();
        setTitle("Cadastro de Dentista");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void salvarDentista() {
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String especialidade = txtEspecialidade.getText();

        // Criação do objeto Dentista
        Dentista dentista = new Dentista(cpf, nome, especialidade);

        // Aqui você pode adicionar a lógica para salvar o dentista em um banco de dados ou lista

        JOptionPane.showMessageDialog(this, "Dentista salvo com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroDentista().setVisible(true);
            }
        });
    }
}

