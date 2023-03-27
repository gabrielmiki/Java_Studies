package exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {

    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) throw new DivisaoNaoExata("Divisao não exata!");

                int result = numerador[i] / denominador[i];

                System.out.println(result);
            }
            catch (DivisaoNaoExata e) {
                e.getMessage();
            }
            catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisao por zero!");
            }
            catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Excedeu o temanho do array!");
            }
        }

        System.out.println("O programa continua!");
    }
}

class DivisaoNaoExata extends Exception {

    public DivisaoNaoExata(String message) {
        super(message);
    }
}