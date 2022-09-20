public class ex4 {
    public static void main(String[] args) {
        /*Escreva um programa que recebe a cotação do dólar do dia e, em seguida recebe um valor em reais.
         A saída é a quantia em dólares. Use formatação de saída para exibir os valores de acordo
         com cada representação de moeda.*/
        double cotacaoDolar = 5.17;
        double valorReais = 20.0;
        double converteReais = valorReais * cotacaoDolar;
        System.out.printf("A cotação do dolar hoje é R$:%.2f, portando R$:%.2f ficam US$:%.2f dolares", cotacaoDolar, valorReais, converteReais);

    }
}
