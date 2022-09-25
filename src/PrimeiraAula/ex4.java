package PrimeiraAula;

public class ex4 {
    public static void main(String[] args) {
        double cotacaoDolar = 5.17;
        double valorReais = 20.0;
        double converteReais = valorReais * cotacaoDolar;
        System.out.printf("A cotação do dolar hoje é de R$:%.2f, portanto R$:%.2f ficam US$:%.2f dolares", cotacaoDolar, valorReais, converteReais);

    }
}
