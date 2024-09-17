import java.awt.*;
import javax.swing.*;

public class Televisao {
    private JLabel labelStatus;
    private int volume = 0;
    private int canal = 1;
    private boolean ligada = false;
    private String nometv;
    public Televisao(String nometv) {
        this.nometv = nometv;
        JFrame telaTV = new JFrame(this.nometv);
        telaTV.setSize(700, 500);
        telaTV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaTV.setLocation(100, 300);
        telaTV.setLayout(null);
        labelStatus = new JLabel("TV DESLIGADA");
        labelStatus.setBounds(0, 0, 300, 100);
        labelStatus.setFont(new Font("Arial", Font.BOLD, 20));
        labelStatus.setForeground(Color.WHITE);
        telaTV.add(labelStatus);

        telaTV.getContentPane().setBackground(Color.BLACK);

        telaTV.setVisible(true);
    }

    
    public String getNometv() {
        return nometv;
    }


    public void setNometv(String nometv) {
        this.nometv = nometv;
    }


    public void ligarOuDesligar() {
        if (ligada) {
            ligada = false;
            labelStatus.setText("TV DESLIGADA");
        } else {
            ligada = true;
            labelStatus.setText("TV LIGADA - CH: " + canal + " VOL: " + volume);
        }
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            labelStatus.setText("Volume: " + volume);
            System.out.println("Volume: " + volume);
        }
        else {
            System.out.println("TV DESLIGADA.");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            labelStatus.setText("Volume: " + volume);
            System.out.println("Volume: " + volume);
        }
        else {
            System.out.println("TV DESLIGADA.");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            labelStatus.setText("Canal: " + canal);
            System.out.println("Canal: " + canal);
        }
        else {
            System.out.println("TV DESLIGADA.");
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 1) {
            canal--;
            labelStatus.setText("Canal: " + canal);
            System.out.println("Canal: " + canal);
        }
        else {
            System.out.println("TV DESLIGADA.");
        }
    }
}
