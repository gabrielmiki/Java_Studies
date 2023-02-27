package edu.miki.segundasemana;

public class FomatadorCEP {
    public static void main(String[] args)  {
        try {
            String cepFormatado = formatarCEP("12121212");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCEP(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "12121212";
    }
}
