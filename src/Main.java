
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main
        extends JFrame {

    public Main() {
        JLabel lblSaludo = new JLabel("Hola Mundo. Creando mi primer proyecto");
        add(lblSaludo);

        this.setSize(200,200);
        this.setTitle("Andrés Aguirre");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
