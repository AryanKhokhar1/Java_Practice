import javax.swing.*;
class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Click here");
        JCheckBox checkBox = new JCheckBox("click");
        checkBox.setBounds(100,100,50,50);
        button1.setBounds(150,200,220,50);
        frame.add(checkBox);
        frame.setVisible(true);
        frame.add(button1);
        frame.setLayout(null);
        frame.setSize(500,600);
    }
}