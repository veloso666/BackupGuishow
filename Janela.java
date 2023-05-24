package gui;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;// é responsável por lidar com o tratamento de eventos de interface do usuário (UI) em aplicações gráficas.
import java.awt.Font;//fornece varias fontes
import java.awt.Toolkit;
import java.awt.event.ActionEvent;//representar um evento de ação
import java.awt.event.ActionListener;// usada para lidar com eventos de ação
import java.util.Arrays;

import javax.swing.JButton;//cria um botão
import javax.swing.JCheckBox;//cria uma caixa de opções
import javax.swing.JFrame;//cria uma janela
import javax.swing.JLabel;// é usada para exibir um rótulo ou texto 
import javax.swing.JOptionPane;//fornece uma caixa de diálogo pré-definida para exibir mensagens, solicitar entrada do usuário e exibir opções.
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.eclipse.wb.swing.FocusTraversalOnArray;


public class Janela extends JFrame{
 static final long serialVersionUID = 1L;
 
	private String x = "Teste";  //atributos de janela
	private char[] senia ;
	private char[] senia2;
	private JFrame frmCadastrar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //cria uma fila para executar depois
			public void run() { //funçao para executar
				try {
					Janela window = new Janela(); 
					window.frmCadastrar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() { //metodo para criar a janela recebendo o metodo initialize
		initialize();
	}

	private void initialize() { //inicialização da janela, passando tudo o que vai compor a janela
		frmCadastrar = new JFrame();
		frmCadastrar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jlvat\\Downloads\\aaa.png"));
		frmCadastrar.setTitle("Cadastrar");
		frmCadastrar.setBounds(100, 100, 530, 364);
		frmCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:"); 
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(83, 11, 46, 20);
		frmCadastrar.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(123, 11, 258, 20);
		frmCadastrar.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(83, 55, 46, 17);
		frmCadastrar.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 53, 258, 20);
		frmCadastrar.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(0, 255, 0));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(textField.getText());
				cliente.setEmail(textField_1.getText());
				cliente.setIdade(Integer.parseInt(textField_2.getText()));
				cliente.setCurso(x);
				senia = passwordField.getPassword();
				senia2 = passwordField_1.getPassword();
				boolean passwordsMatch = Arrays.equals(senia, senia2);
				if(passwordsMatch) {
					cliente.setSenha(String.valueOf(senia));
					JOptionPane.showMessageDialog(null, cliente.salvar());
				}else {
					JOptionPane.showMessageDialog(null, "Senhas inconpativeis!", "Alerta", JOptionPane.WARNING_MESSAGE);

				}
			}
		});
	
		btnCadastrar.setBounds(219, 241, 105, 31);
		frmCadastrar.getContentPane().add(btnCadastrar);
		
		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setBounds(80, 98, 46, 14);
		frmCadastrar.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(123, 95, 32, 20);
		frmCadastrar.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox.setBounds(123, 211, 61, 23);
		frmCadastrar.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					x = "Java";
				}				
			}
		});
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PHP");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_1.setBounds(186, 211, 58, 23);
		frmCadastrar.getContentPane().add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected()) {
					x = "PHP";
				}				
			}
		});
		
		final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("C#");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_2.setBounds(246, 211, 51, 23);
		frmCadastrar.getContentPane().add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_2.isSelected()) {
					x = "C#";
				}				
			}
		});	
	
		
		final JCheckBox chckbxNewCheckBox_3 = new JCheckBox("C++");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_3.setBounds(299, 211, 51, 23);
		frmCadastrar.getContentPane().add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_3.isSelected()) {
					x = "C++";
				}				
			}
		});	
		
		final JCheckBox chckbxNewCheckBox_4 = new JCheckBox("JavaScript");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		chckbxNewCheckBox_4.setBounds(352, 211, 97, 23);
		frmCadastrar.getContentPane().add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_4.isSelected()) {
					x = "JavaScript";
				}				
			}
		});	
		
		JLabel lblNewLabel_3 = new JLabel("Senha:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(78, 137, 46, 14);
		frmCadastrar.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirmar senha:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setBounds(20, 173, 97, 20);
		frmCadastrar.getContentPane().add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 134, 67, 20);
		frmCadastrar.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(123, 173, 67, 20);
		frmCadastrar.getContentPane().add(passwordField_1);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setBackground(Color.RED);
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnCancel.setBounds(219, 294, 105, 20);
		frmCadastrar.getContentPane().add(btnCancel);
		frmCadastrar.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, textField, lblNewLabel_1, textField_1, btnCadastrar, lblNewLabel_2, textField_2, chckbxNewCheckBox, chckbxNewCheckBox_1, chckbxNewCheckBox_2, lblNewLabel_3, lblNewLabel_4, passwordField, passwordField_1, chckbxNewCheckBox_3, chckbxNewCheckBox_4, btnCancel}));
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	           System.exit(DISPOSE_ON_CLOSE);
			}
		});
	
	}
}