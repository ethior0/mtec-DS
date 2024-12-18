package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField edtNome;
	private JTextField edtApel;
	private JTextField edtTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		edtNome = new JTextField();
		edtNome.setBounds(143, 95, 187, 20);
		contentPane.add(edtNome);
		edtNome.setColumns(10);
		
		edtApel = new JTextField();
		edtApel.setBounds(143, 126, 187, 20);
		contentPane.add(edtApel);
		edtApel.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(74, 98, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apelido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(74, 129, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		edtTel = new JTextField();
		edtTel.setBounds(143, 157, 187, 20);
		contentPane.add(edtTel);
		edtTel.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(74, 160, 56, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnCadt = new JButton("Cadastrar");
		btnCadt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexao bd = new Conexao();
				bd.conectar();
				
				String nome = edtNome.getText();
				String apelido = edtApel.getText();
				String telefone = edtTel.getText();
				
				bd.inserirContato(nome, apelido, telefone);
				
				edtNome.setText("");
				edtApel.setText("");
				edtTel.setText("");
			}
		});
		btnCadt.setBounds(65, 209, 89, 23);
		contentPane.add(btnCadt);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setBounds(278, 209, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel titulo = new JLabel("Cadastro de Amigos");
		titulo.setForeground(new Color(255, 204, 0));
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		titulo.setBounds(143, 26, 160, 20);
		contentPane.add(titulo);
	}

}
