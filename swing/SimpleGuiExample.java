import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGuiExample extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel labelName, labelAge, labelAddress;
    private JTextField fieldName, fieldAge;
    private JTextArea fieldAddress;
    private JButton addButton;

    public static void main(String[] args) {
        new SimpleGuiExample();
    }

    SimpleGuiExample() {
        setupFrame();
        setupNameField();
        setupAgeField();
        setupAddressField();
        setupButton();
    }

    private void setupFrame() {
        setSize(1366, 768);
        setVisible(true);
        setTitle("Contoh Program Input Biodata");
    }

    private void setupNameField() {
        // Add "Nama" label to frame
        labelName = new JLabel("Nama");
        labelName.setBounds(20, 20, 100, 10); 
        getContentPane().add(labelName);

        // Add "Nama" field to frame
        fieldName = new JTextField();
        fieldName.setBounds(20, 40, 300, 30);  
        getContentPane().add(fieldName);
    }

    private void setupAgeField() {
        // Add "Usia" label to frame
        labelAge = new JLabel("Usia");
        labelAge.setBounds(20, 80, 100, 10);
        getContentPane().add(labelAge);

        // Add "Usia" field to frame
        fieldAge = new JTextField();
        fieldAge.setBounds(20, 100, 300, 30);  
        getContentPane().add(fieldAge);
    }

    private void setupAddressField() {
        // Add "Alamat" label to frame
        labelAddress = new JLabel("Alamat");
        labelAddress.setBounds(20, 140, 100, 10);
        getContentPane().add(labelAddress);

        // Add "Alamat" field to frame
        fieldAddress = new JTextArea();
        fieldAddress.setSize(200, 100); 
        getContentPane().add(fieldAddress);
    }

    private void setupButton() {
        // Add "Tambah" button to frame
        addButton = new JButton("Tambah");
        addButton.setBounds(20, 420, 50, 30);
        addButton.setSize(200, 100);
        // addButton.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane().showMessageDialog(this, "Hello, Welcome to Javatpoint."); 
        //     }
        // });
        getContentPane().add(addButton, BorderLayout.CENTER);
    }
}