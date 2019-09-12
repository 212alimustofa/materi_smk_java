import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        JButton button = new JButton("Tampilkan pesan"); 
        button.setBounds(20, 20, 50, 30);
        button.setSize(100, 40);
        // button.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(getContentPane(), "Nama tidak boleh kosong", "Hasil Input Kalian", JOptionPane.ERROR_MESSAGE);
        //     }
        // });
        frame.getContentPane().add(button);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }
}