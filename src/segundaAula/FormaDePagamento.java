package segundaAula;

import java.util.Scanner;

public class FormaDePagamento {
    //public enum FormaDePagamento {
    //    DINHEIRO,
    //    CARTAO_DE_CREDITO,
    //    CARTAO_DE_DEBITO,
    //    A_PRAZO,
    //    PIX
    //}
    public static void main(String[] args) {
        System.out.println("Opções de pagamento: ");
        System.out.println("Dinheiro = 1 ");
        System.out.println("Cartão de credito = 2 ");
        System.out.println("Cartão de debito = 3 ");
        System.out.println("A prazo = 4 ");
        System.out.println("Pix = 5 ");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite a opção de pagamento: ");
//        int codigo = input.nextInt();
//
//        Pagamento opcaoSelecionada = Pagamento.values()[--codigo];
//
//        switch (opcaoSelecionada) {
//            case DINHEIRO: System.out.println("Você selecionou Dinheiro");
//
//            case CARTAO_DE_CREDITO: System.out.println("Você selecionou Cartão de Credito");
//
//            case CARTAO_DE_DEBITO: System.out.println("Você selecionou Cartão de Debito");
//
//            case A_PRAZO: System.out.println("Você selecionou a prazo");
//
//            case PIX: System.out.println("Você selecionou pix");
//
//            default: System.out.println("Você selecionou uma opção invalida");
//        }

        Pagamento formaPagamento = opcaoPagamento();
            while(formaPagamento == Pagamento.ERRO){
                System.out.println("Opção invalida, tente novamente ");
                formaPagamento = opcaoPagamento();
            }
        System.out.println("A forma de pagamento é: " + formaPagamento);
    }

    private static Pagamento opcaoPagamento(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção de pagamento: ");
        int x = input.nextInt();
        input.close();
        switch (x) {
            case 1: return Pagamento.DINHEIRO;

            case 2: return Pagamento.CARTAO_DE_CREDITO;

            case 3:return Pagamento.CARTAO_DE_DEBITO;

            case 4:return Pagamento.A_PRAZO;

            case 5: return Pagamento.PIX;

            default: return Pagamento.ERRO;
        }

    }
}
