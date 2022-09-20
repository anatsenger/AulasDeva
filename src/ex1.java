public class ex1 {
    public static void main(String[] args) {
        double tempoGasto = 2;
        double velocidadeMedia = 80.0;
        double distacia = tempoGasto * velocidadeMedia;
        double litrosUsados = distacia / 12;
//        System.out.println("Para uma viagem de " + tempoGasto + " horas com a velocidade de " +velocidadeMedia+
//                "km/h percorreu-se a distancia de " + distacia + "km e foram necessários " + litrosUsados +
//                " litros de combustível");
        System.out.printf("Para uma viagem de %.1f horas com a velocidade de %.2fKm/h percorreu-se a" +
                " distancia de %.2fKm e foram necessários %.2fL de combustível.", tempoGasto, velocidadeMedia, distacia, litrosUsados);
    }

}
