package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Surpresa {
    public static void main(String[] args) {
        // Cria a janela
        JFrame janela = new JFrame("Principe nigeriano");

        // Cria um painel
        JPanel painel = new JPanel();

        // Cria um botão
        JButton botao = new JButton("Supresinha");

        // Cria um componente de texto grande (JTextArea)
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

        // Adiciona o botão ao painel
        painel.add(botao);

        // Adiciona o painel à janela
        janela.getContentPane().add(painel);

        // Configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);

        // Define a ação do botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, texto.getText(), "Texto Exibido", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
