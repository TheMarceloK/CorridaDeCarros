package teste;

import java.util.Random;

class Carro extends Thread {
    private int id;
    private int linhaChegada;
    private double velocidade = 0; // V0
    private double posicao = 0;    // S0
    private Random random = new Random();
    
    public Carro(int id, int linhaChegada) {
        this.id = id;
        this.linhaChegada = linhaChegada;
    }

    @Override
    public void run() {
        double t = 1; 

        while (posicao < linhaChegada) {
            try {
                Thread.sleep(1000);
                
                double aceleracao = random.nextInt(5) + 1; 
                
                velocidade = velocidade + (aceleracao * t);
                
                double deslocamento = velocidade * t;
                posicao = posicao + deslocamento;

                System.out.printf("O Carro_%02d andou %dm \t e já percorreu %dm%n", 
                        id, (int)deslocamento, (int)posicao);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Carro_%02d alcançou a linha de chegada%n", id);
    }
}