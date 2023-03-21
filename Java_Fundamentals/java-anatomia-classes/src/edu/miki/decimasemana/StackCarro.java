package edu.miki.decimasemana;

import java.util.Stack;

public class StackCarro {
    
    public static void main(String[] args) {
        
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Wolks"));

        System.out.println(stackCarros);

        stackCarros.pop();

        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());

        System.out.println(stackCarros.empty());
    }
}
