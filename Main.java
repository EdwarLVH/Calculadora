import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog("Ingrese el primer número:");
        String num2String = JOptionPane.showInputDialog("Ingrese el segundo número:");

        // Convertir los números ingresados de String a double
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);

        String[] operaciones = {"Suma", "Resta", "Multiplicación", "División"};
        String operacion = (String) JOptionPane.showInputDialog(null, "Seleccione la operación a realizar:",
                "Operación", JOptionPane.QUESTION_MESSAGE, null, operaciones, operaciones[0]);

        double resultado = 0;

        switch (operacion) {
            case "Suma":
                resultado = num1 + num2;
                break;
            case "Resta":
                resultado = num1 - num2;
                break;
            case "Multiplicación":
                resultado = num1 * num2;
                break;
            case "División":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación inválida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
