package semana02.desi.java.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface {
    
    public PrimeiraInterface(){
        JFrame janela = new JFrame("CUIDADO VIRUS TOTAL");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 500);
        
        janela.setLayout(null);
        
        
        
        JLabel texto = new JLabel("TEXTO");
        texto.setBounds(200, 200, 150, 50);
        
        JTextField input = new JTextField();
        input.setBounds(200, 300, 150, 50);
        
        JButton botao = new JButton("Não clique aqui");
        botao.setBounds(200, 250, 150, 25);
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String mensagem = input.getText();
                texto.setText(mensagem);
            }
        });
        
        janela.add(input);
        janela.add(botao);
        janela.add(texto);
        
        janela.setVisible(true);
    }
    
}
