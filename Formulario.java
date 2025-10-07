import javax.swing.*;

public class Formulario extends JFrame {
    private JLabel label;

    public Formulario(){
        setLayout(null);
        label = new JLabel("Hola Mundo");
        label.setBounds(10, 20, 200, 300);
        add(label);
    }

    public static void main(String[] args){
        Formulario formulario = new Formulario();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
}