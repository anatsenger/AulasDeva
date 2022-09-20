public class ex5 {
    public static void main(String[] args) {
        //Escreva um programa que realiza conversão de medidas de polegadas em centímetros.
        //1 polegada = 2,54 cm
        final double POLEGADAS_EM_CM = 2.54;
        double polegada = 5.0;
        double polegadaToCm = polegada * POLEGADAS_EM_CM;
        System.out.printf("%.1f polegadas em centimetros ficam: %.2fcm", polegada, polegadaToCm);
    }
}
