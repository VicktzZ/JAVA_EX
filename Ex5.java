import java.awt.*;
import javax.swing.*;

public class Ex5 { // Criação da classe Ex5
    public static void main(String[] args) { // Inicialização do método "main"
        JFrame frame = new JFrame("Login"); // Instanciação da classe JFrame
        JPanel panel = new JPanel(); // Instanciação da classe JPanel

        // label.setFont(new Font("Arial", Font.BOLD, 180));
  
        frame.setSize(300, 300); // Aplica o tamanho de 300px ao a largura e altura do frame
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Por padrão, quando a aplicação fechar, ela deve encerrar seu processo
      frame.add(panel); // Adiciona ao frame o painel
      panel.setLayout(null); // Tira o layout padrão do painel

      final JLabel userLabel = new JLabel("Usuário: ");
      userLabel.setBounds(10, 20, 80, 25);
      panel.add(userLabel);
      
      JTextField userText = new JTextField(20);
      userText.setBounds(100, 20, 165, 25);
      panel.add(userText);

      final JLabel passLabel = new JLabel("Senha: ");
      passLabel.setBounds(10, 50, 80, 25);
      panel.add(passLabel);

      JPasswordField passText = new JPasswordField(20);
      userText.setBounds(100, 50, 165, 25);
      panel.add(passText);

      JButton button = new JButton("Login");
      button.setBounds(10, 80, 80, 25);
      panel.add(button);

      frame.setVisible(true); // Deixa o frame visível
    }  
}
