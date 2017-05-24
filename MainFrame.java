import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {
   JPanel contentPane;
   JLabel imageLabel = new JLabel();
   JLabel headerLabel = new JLabel();

   public MainFrame() {
      try {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         contentPane = (JPanel) getContentPane();
         contentPane.setLayout(new BorderLayout());
         setSize(new Dimension(320, 320));
         setTitle("Nice!");
         // add the header label
         headerLabel.setFont(new java.awt.Font("Comic Sans MS", Font.BOLD, 16));
         headerLabel.setText("   You escaped!");
         contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
         // add the image label
         ImageIcon ii = new ImageIcon(this.getClass().getResource(
                "homer.gif"));
         imageLabel.setIcon(ii);
         contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
         // show it
        
         this.setLocationRelativeTo(null);
         this.setVisible(true);
         
         
   
      } 
      catch (Exception exception) {
    
         exception.printStackTrace();
      }
   }
}