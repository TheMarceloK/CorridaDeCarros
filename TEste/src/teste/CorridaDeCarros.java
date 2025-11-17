package teste;
import java.util.Random;

public class CorridaDeCarros {

    public static void main(String[] args) {
        int distanciaTotal = 200;
        
        Carro carro1 = new Carro(1, distanciaTotal);
        Carro carro2 = new Carro(2, distanciaTotal);
        Carro carro3 = new Carro(3, distanciaTotal);
        Carro carro4 = new Carro(4, distanciaTotal);
        Carro carro5 = new Carro(5, distanciaTotal);

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
        carro5.start();
    }
}
