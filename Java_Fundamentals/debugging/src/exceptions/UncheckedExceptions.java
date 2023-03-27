package exceptions;

import javax.swing.*;

public class UncheckedExceptions {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerator: ");
        String b = JOptionPane.showInputDialog("Denominator: ");

        try {
            Integer result = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado :" + result);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada Inválida, informe número inteiro! " +
                    e.getMessage());
            // throw new RuntimeException(e);
        }
        catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divisão por zero!");
        }
        finally {
            System.out.println("Finally!");
        }
    }

    private static Integer dividir(int a, int b) {
        return a/b;
    }
}
