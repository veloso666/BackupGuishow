package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends Cliente {

	public JFrame frmLogin;
	public JTextField textField;
	public JPasswordField passwordField;
	public String email;
	public char[] senha;
	public String x = "z";
	Cliente cliente = new Cliente();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	
	public void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joao.lucas\\Downloads\\aa.png"));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 549, 379);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(64, 68, 38, 25);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(56, 129, 46, 14);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(104, 70, 108, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(104, 126, 108, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email = textField.getText();
				sup surpresa = new sup();
				senha = passwordField.getPassword();
				if(cliente.Leitura(email)&&(cliente.Leitura2(String.valueOf(senha)))) {
					JOptionPane.showMessageDialog(null,"Login efetuado com sucesso", email, JOptionPane.WARNING_MESSAGE);
					surpresa.frame.setVisible(true);
					frmLogin.dispose();
				}
				else{
				JOptionPane.showMessageDialog(null,"Usuario não encontrado ou senha incorreta", email, JOptionPane.WARNING_MESSAGE);

			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(222, 252, 101, 35);
		frmLogin.getContentPane().add(btnNewButton);
	}
/*
	public void setVisible(boolean b) {
		Login login = new Login();
		login.Login();
		login.setVisible(true);
		
	}
	*/
}