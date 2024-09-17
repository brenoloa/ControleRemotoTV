import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ControleRemoto {

    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;

        JFrame tela = new JFrame("Controle Remoto");
        tela.setSize(250, 450);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);  
        
        // ON
        JButton botaoOn = new JButton("ON");
        botaoOn.setBackground(Color.RED);
        botaoOn.setForeground(Color.WHITE);
        botaoOn.setFont(new Font("Arial", Font.BOLD, 16));
        botaoOn.setBounds(5, 20, 100, 40); 
        tela.add(botaoOn);

        // LVOL
        JLabel volLabel = new JLabel("VOL");
        volLabel.setForeground(Color.WHITE);
        volLabel.setFont(new Font("Arial", Font.BOLD, 16));
        volLabel.setBounds(50, 100, 50, 30); 
        tela.add(volLabel);

        // VOL +
        JButton volMais = new JButton("+");
        volMais.setFont(new Font("Arial", Font.BOLD, 20));
        volMais.setBounds(40, 140, 60, 80); 
        tela.add(volMais);

        // VOL -
        JButton volMenos = new JButton("-");
        volMenos.setFont(new Font("Arial", Font.BOLD, 20));
        volMenos.setBounds(40, 220, 60, 80);
        tela.add(volMenos);

        // LCH
        JLabel chLabel = new JLabel("CH");
        chLabel.setForeground(Color.WHITE);
        chLabel.setFont(new Font("Arial", Font.BOLD, 16));
        chLabel.setBounds(140, 100, 50, 30); 
        tela.add(chLabel);

        // CH+
        JButton chMais = new JButton("+");
        chMais.setFont(new Font("Arial", Font.BOLD, 20));
        chMais.setBounds(130, 140, 60, 80); 
        tela.add(chMais);

        // CH-
        JButton chMenos = new JButton("-");
        chMenos.setFont(new Font("Arial", Font.BOLD, 20));
        chMenos.setBounds(130, 220, 60, 80); 
        tela.add(chMenos);

        
        tela.getContentPane().setBackground(Color.GRAY);

        botaoOn.addActionListener(this::ligar);
        chMenos.addActionListener(this::diminuirCanal);
        chMais.addActionListener(this::aumentarCanal);
        volMais.addActionListener(this::aumentarVolume);
        volMenos.addActionListener(this::diminuirVolume);
       

        tela.setVisible(true);
    }

    private void diminuirCanal(ActionEvent e) {
        tv.diminuirCanal();
    }

    private void aumentarCanal(ActionEvent e) {
        tv.aumentarCanal();
    }

    private void aumentarVolume(ActionEvent e) {
        tv.aumentarVolume();
    }

    private void diminuirVolume(ActionEvent e) {
        tv.diminuirVolume();
    }

    private void ligar(ActionEvent e) {
        tv.ligarOuDesligar();
    }

    
}
