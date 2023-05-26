package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class sup {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sup window = new sup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JTextArea texto = new JTextArea();
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);
        texto.setEditable(false);
        texto.setText("ME CHAMO PRÍNCIPE ADILA KWAME E TENHO TRINTA MILHÕES DE DÓLARES AMERICANOS QUE RECEBI\n"
                + "DE UM CONTRATO DE PETRÓLEO BRUTO ADICIONADO A EMPREITEIROS ESTRANGEIROS NA NIGERIAN NATIONAL PETROLEUM CORPORATION (NNPC).\n"
                + "ESTAMOS BUSCANDO SUA ASSISTÊNCIA E PERMISSÃO PARA TRANSFERIR ESTE VALOR PARA SUA CONTA. SUA COMISSÃO É TRINTA POR CENTO DO DINHEIRO.\n"
                + "POR FAVOR, AVISE-ME SUA ACEITAÇÃO PARA FAZER ESTE NEGÓCIO URGENTEMENTE.\n"
                + "OS HOMENS ENVOLVIDOS SÃO HOMENS NO GOVERNO. MAIS DETALHES SERÃO ENVIADOS A VOCÊ POR EMAIL ASSIM QUE TIVERMOS INFORMAÇÕES.\n"
                + "PARA FINS DE COMUNICAÇÃO NESTE ASSUNTO, PODEMOS TER SEU EMAIL, NÚMEROS DE TELEFONE,\n"
                + " INCLUINDO SEU NÚMERO DE TELEFONE RESIDENCIAL PARTICULAR.\n"
                + "ENTRE EM CONTATO COM URGÊNCIA ATRAVÉS DO EMAIL ACIMA.\n\n"
                + "POR FAVOR, TRATE COMO MAIS CONFIDENCIAL, TODAS AS RESPOSTAS ESTRITAMENTE POR DHL COURIER OU ATRAVÉS DO EMAIL ACIMA.\n\n"
                + "OBRIGADO PELA SUA COOPERAÇÃO\n"
                + "ADILA KWAME");
		
		JButton btnNewButton = new JButton("Surpresa");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, texto.getText(), "Texto Exibido", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

}
