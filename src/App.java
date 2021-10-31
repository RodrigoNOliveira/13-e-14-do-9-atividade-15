import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String sexoS = JOptionPane.showInputDialog(null, "Escolha seu sexo\n1- Homem\n2- Mulher ", "Peso ideal",
                JOptionPane.QUESTION_MESSAGE);
        int sexo = Integer.parseInt(sexoS);

        if (sexo == 1) {
            String alturaS = JOptionPane.showInputDialog(null, "Digite sua altura: ", "Peso ideal",
                    JOptionPane.QUESTION_MESSAGE);
            double altura = Double.parseDouble(alturaS);

            double pesoIdeal = (72.2 * altura) - 58;

            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoIdeal, "Peso ideal",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (sexo == 2) {
            String alturaS = JOptionPane.showInputDialog(null, "Digite sua altura: ", "Peso ideal",
                    JOptionPane.QUESTION_MESSAGE);
            double altura = Double.parseDouble(alturaS);
            double pesoIdeal = (62.1 * altura) - 44.7;

            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoIdeal, "Peso ideal",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(null, "Opção invalida", "Peso ideal", JOptionPane.ERROR_MESSAGE);
        }

    }
}