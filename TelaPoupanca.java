import javax.swing.*;
import java.awt.*;

public class TelaPoupanca {
    public static void main(String[] args) {

        // FRAME
        JFrame frame = new JFrame("Poupex");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PANEL PRINCIPAL
        JPanel panel = new JPanel();
        panel.setBackground(new Color(128, 128, 128));
        panel.setLayout(new BorderLayout());

        // PANEL DE CAMPOS (LABELS + TEXTFIELDS)
        JPanel camposPanel = new JPanel();
        camposPanel.setLayout(new GridLayout(5, 7, 10, 10)); // 5 linhas, 7 colunas
        camposPanel.setBackground(new Color(128, 128, 128));

        // LABELS E TEXTFIELDS
        JLabel label1 = new JLabel("Juros ao mes %:");
        JTextField field1 = new JTextField(10);

        JLabel label2 = new JLabel("Num. de anos:");
        JTextField field2 = new JTextField(10);

        JLabel label3 = new JLabel("Deposito mensal R$:");
        JTextField field3 = new JTextField(10);

        JLabel label4 = new JLabel("Total poupado R$:");
        JTextField field4 = new JTextField(10);

        // Adiciona os componentes no painel de campos
        camposPanel.add(label1);
        camposPanel.add(field1);
        camposPanel.add(label2);
        camposPanel.add(field2);
        camposPanel.add(label3);
        camposPanel.add(field3);
        camposPanel.add(label4);
        camposPanel.add(field4);

        // BOTÃO
        JButton button = new JButton("OK");
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLUE);
        button.setPreferredSize(new Dimension(150, 50));

        // ADICIONA PAINÉIS AO FRAME
        panel.add(camposPanel, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
