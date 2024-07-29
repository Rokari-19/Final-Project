package Swing;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class PasswordGeneratorGUI extends JFrame{

     password generator object 
    // Biggie06 
    
     private PasswordGenerator passgen;
     public PasswordGeneratorGUI() {
        super("Password Generator");
        setSize(540, 570);
        setResizable(false);
        getContentPane().setBackground(Color.black);
         setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
          pass gen obj init
        passgen = new PasswordGenerator();


         addGuiComponents();
     }

    public void addGuiComponents() {
        babyboywakiks
        JLabel titlelabel = new JLabel("Password Generator");
        titlelabel.setFont(new Font("Dialog", Font.BOLD, 32));
        titlelabel.setForeground(Color.white);
        titlelabel.setHorizontalAlignment(SwingConstants.CENTER);
        titlelabel.setBounds(0, 10, 540, 39);
        add(titlelabel);

        JTextArea passwordoutput = new JTextArea();
        passwordoutput.setEditable(false);
        passwordoutput.setFont(new Font("Dialog", Font.BOLD, 32));


        JScrollPane passOutScrollPane = new JScrollPane(passwordoutput);
        passOutScrollPane.setBounds(25, 97, 479, 70);
        passOutScrollPane.setBorder(BorderFactory.createLineBorder(Color.white));
        add(passOutScrollPane);

        JLabel passLengthLabel = new JLabel("Password Length:");
        passLengthLabel.setFont(new Font("Dialog", Font.BOLD, 25));
        passLengthLabel.setForeground(Color.white);
        passLengthLabel.setBounds(25, 215, 272, 34);
        add(passLengthLabel);

        JTextArea passLengthInput = new JTextArea();
        passLengthInput.setFont(new Font("Dialog", Font.PLAIN, 32 ));
        passLengthInput.setBorder(BorderFactory.createLineBorder(Color.white));
        passLengthInput.setBounds(310, 215, 192, 39);
        add(passLengthInput);


        // upper-case toggle
        JToggleButton upperCaseToggle = new JToggleButton("Upper Case");
        upperCaseToggle.setFont(new Font("Dialog", Font.BOLD, 25));
        upperCaseToggle.setBounds(25, 302, 225, 56);
        add(upperCaseToggle);


        // lower-case toggle
        JToggleButton lowerCaseToggle = new JToggleButton("Lower Case");
        lowerCaseToggle.setBounds(282, 302, 225, 56);
        lowerCaseToggle.setFont(new Font("Dialog", Font.BOLD, 25));
        add(lowerCaseToggle);

        // numbers toggle
        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setFont(new Font("Dialog", Font.BOLD, 25));
        numbersToggle.setBounds(25, 373, 225, 56);
        add(numbersToggle);


        // symbols toggle



        // Oha Chidera Peter || Chidex550
        // chidera, uncomment evrything from here downwards and then delete this line of instructions
//         JToggleButton symbolsToggle = new JToggleButton("Symbols");
//         symbolsToggle.setFont(new Font("Dialog", Font.BOLD, 25));
//         symbolsToggle.setBounds(282, 373, 225, 56);
//         add(symbolsToggle);



//         // generate button
//         JButton generateButton = new JButton("Generate Password");
//         generateButton.setFont(new Font("Dialog", Font.BOLD, 15));
//         generateButton.setBounds(25, 477, 222, 41);
//         generateButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 if (passLengthInput.getText().length() <= 0) return;
//                 boolean anyToggleSelected = lowerCaseToggle.isSelected() || upperCaseToggle.isSelected() || numbersToggle.isSelected() || symbolsToggle.isSelected();

//                 int passwordLength = Integer.parseInt(passLengthInput.getText());
//                 if (anyToggleSelected) {
//                     String generatedPasword = passgen.GeneratePassword(passwordLength, 
//                         upperCaseToggle.isSelected(),
//                         lowerCaseToggle.isSelected(),
//                         numbersToggle.isSelected(),
//                         symbolsToggle.isSelected()
//                     );
//                 passwordoutput.setText(generatedPasword);

//                 };
//             }
//         });

//         add(generateButton);

//         JButton saveButton = new JButton("Save Password");
//         saveButton.setFont(new Font("Dialog", Font.BOLD, 15));
//         saveButton.setBounds(282, 477, 222, 41);
//         saveButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String password = passwordoutput.getText();
//                 if (!password.isEmpty()) {
//                     savePasswordToFile(password, "password.txt");
//                 }
//             }
//         });
//         add(saveButton);
//     }

//     private void savePasswordToFile(String password, String fileName) {
//         try (FileWriter fileWriter = new FileWriter(fileName)) {
//             fileWriter.write(password);
//             JOptionPane.showMessageDialog(this, "Password saved to " + fileName);
//         } catch (IOException e) {
//             JOptionPane.showMessageDialog(this, "Error saving password: " + e.getMessage());
//             e.printStackTrace();
//         }
//     }
}

