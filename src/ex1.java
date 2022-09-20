public class ex1 {
    public static void main(String[] args) {
        double tempoGasto = 2;
        double velocidadeMedia = 80.0;
        double distacia = tempoGasto * velocidadeMedia;
        double litrosUsados = distacia / 12;
        System.out.printf("Para uma viagem de %.1f horas com a velocidade de %.2fKm/h, percorreu-se a" +
                " distância de %.2fKm e foram necessários %.2fL de combustível.", tempoGasto, velocidadeMedia, distacia, litrosUsados);
    }

}
