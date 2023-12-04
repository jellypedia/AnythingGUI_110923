import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Anything extends JFrame {

    private JPanel jpanel;
    private JButton gwapaKoButton;
    private JTextField textField1;
    private JRadioButton femaleRadioButton;
    private JRadioButton maleRadioButton;
    private JRadioButton secretRadioButton;
    private JTextArea textArea;
    private JComboBox comboBox1;
    private JCheckBox cCheckBox;
    private JCheckBox assemblyCheckBox;
    private JCheckBox javaCheckBox;

    public Anything() {
        gwapaKoButton.addActionListener(e -> {
            Date currentDate = new Date();
            textArea.append(String.valueOf(currentDate));
            String name = textField1.getText();
            if(name.equals("")) {
                JOptionPane.showMessageDialog(this,"INVALID");
            } else {
                System.out.println("Subscriber count: 1, thanks " + name + "!");
                System.out.print("I hacked into your Google account! Your gender is ");
                if(femaleRadioButton.isSelected()) {
                    textArea.append("female");
                    System.out.print("female");
                } else if(maleRadioButton.isSelected()) {
                    textArea.append("male");
                    System.out.print("male");
                }else if(secretRadioButton.isSelected()) {
                    textArea.append("a secret");
                    System.out.print("a secret");
                }
            }
            String color = (String) comboBox1.getSelectedItem();
            int test = comboBox1.getSelectedIndex();
            textArea.append("\ny-y-y-y-y-your fave color is also " + color + " testing index: " + test);
            System.out.println("\nYOUR FAVORITE COLOR IS " + color);

            if(!cCheckBox.isSelected() && !assemblyCheckBox.isSelected() && !javaCheckBox.isSelected()) {
                int option = JOptionPane.showConfirmDialog(this,"noob ka?");
                if(option == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this,"LOL");
                } else if(option == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(this,"LMAO");
                }
            } else {
                textArea.append("\nKAHIBAW KA MO CODE???????");
                if(cCheckBox.isSelected()) {
                    textArea.append("\nKahibaw ka C?\nproud maam cathy nimo!");
                } else if (assemblyCheckBox.isSelected()) {
                    textArea.append("\nKahibaw ka Assembly?\nproud ang dean nimo!");
                } else if (javaCheckBox.isSelected()) {
                    textArea.append("\nKahibaw ka Java?\nproud sir serato nimo!");
                }
            }
        });
    }

    public static void main(String[] args) {
        Anything app = new Anything();
        app.setContentPane(app.jpanel);
        app.setSize(900,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Roblox.exe");
    }

}
