package edu.miki.semanaoito;

public class Main {
    
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> minhaLista = new ListaDuplaEncadeada<>();

        minhaLista.add("C1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");

        System.out.println(minhaLista.get(0));

        minhaLista.remove(3);
        minhaLista.add(3, "C5");

        System.out.println(minhaLista.get(3));
    }
}
