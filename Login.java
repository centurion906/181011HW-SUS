import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    Container cp;
    private JPanel jpn = new JPanel(new GridLayout(2,2,2,2));
    private JPanel jpn1 = new JPanel(new GridLayout(1,3,2,2));
    private JLabel jlb = new JLabel("ID");
    private JLabel jlb2 = new JLabel("PassWord");
    private JTextField jft = new JTextField();
    private JPasswordField jpw = new JPasswordField();
    private JButton jbtnkeyboard = new JButton("KeyBoard");
    private JButton jbtn2 = new JButton("Login");
    private JButton jbtn3 = new JButton("Exit");
    public Login(){
        ex();
    }private void ex(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,150,300,100);
        cp = this.getContentPane();
        cp.add(jpn,BorderLayout.CENTER);
        cp.add(jpn1,BorderLayout.SOUTH);
        jpn.add(jlb);
        jpn.add(jft);
        jpn.add(jlb2);
        jpn.add(jpw);
        jpn1.add(jbtnkeyboard);
        jpn1.add(jbtn2);
        jpn1.add(jbtn3);
        jbtnkeyboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame kyb = new MainFrame(Login.this);
                kyb.setVisible(true);
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (jft.getText().equals("1")&&(new String(jpw.getPassword()).equals("1"))){
                    Frame2 frm2 = new Frame2();
                    frm2.setVisible(true);
                    Login.this.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"Error");
                }
            }
        });
    }
    public void setPassWord(String lg){
        jpw.setText(lg);

    }
}