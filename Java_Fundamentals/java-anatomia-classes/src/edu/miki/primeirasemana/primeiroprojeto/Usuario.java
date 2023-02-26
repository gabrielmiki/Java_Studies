package edu.miki.primeirasemana.primeiroprojeto;

public class Usuario {
    public static void main(String[] args) {
        SmartTV  smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Qual canal? "+ smartTv.canal);
        System.out.println("Qual volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Qual volume? " + smartTv.volume);
        
        smartTv.mudarCanal(10);
        System.out.println("Qual canal? "+ smartTv.canal);
    }    
}
