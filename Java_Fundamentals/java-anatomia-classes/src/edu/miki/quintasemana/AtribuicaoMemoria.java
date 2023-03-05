package edu.miki.quintasemana;

/**
 * <h2> AtribuicaoMemoria </h2>
 * <p> 
 *  Prova que quando se atribui um objeto isso é feito por meio de endereços.
 *  Diferentemente da atribuição de tipos primitivos, na qual se passa o valor 
 * </p>
 */
public class AtribuicaoMemoria {

    public static void main(String[] args) {
        int intA = 2;
        int intB = intA;

        System.out.println(intA);
        System.out.println(intB);

        intA = 10;
        System.out.println(intA);
        System.out.println(intB);

        MeuObjeto meuObjetoA = new MeuObjeto(1);
        MeuObjeto meuObjetoB = meuObjetoA;

        System.out.println("Objeto A: \n" + meuObjetoA + "\n" +
            "Objeto B: \n" + meuObjetoB + "\n");

        meuObjetoA.setNum(2);

        System.out.println("Objeto A: \n" + meuObjetoA + "\n" +
            "Objeto B: \n" + meuObjetoB + "\n");
    }
}