package edu.miki.setimasemana;

public class Main {
    
    public static void main(String[] args) {

        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        minhaLista.add("Teste 1");
        minhaLista.add("Teste 2");
        minhaLista.add("Teste 3");
        minhaLista.add("Teste 4");

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(3));

        System.out.println(minhaLista);

        System.out.println(minhaLista.remove(3));

        System.out.println(minhaLista);
    }
}
