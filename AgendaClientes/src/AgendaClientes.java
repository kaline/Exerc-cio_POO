

import javax.swing.JFrame;

public class AgendaClientes extends JFrame {
    public static void main(String[] args) {
        try {
            AgendaClientes frame = new AgendaClientes();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public AgendaClientes() {
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}