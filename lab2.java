import javax.swing.*;
import java.awt.event.*;

public class lab2 extends javax.swing.JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JTextField textField2;

    public lab2() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String inputText = textField1.getText();


                int midIndex = inputText.length() / 2;


                String rightText = inputText.substring(midIndex);


                String outputText = "";


                for (int i = 0; i < rightText.length(); i += 3) {
                    if (i + 3 < rightText.length()) {
                        outputText += rightText.substring(i, i+2);
                    } else {
                        outputText += rightText.substring(i, i+1) + rightText.substring(i+2);
                    }
                }


                textField2.setText(outputText);
            }
        });

    }

    public static void main(String[] args) {
        lab2 dialog = new lab2();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
