package segundaAula;

import java.util.Scanner;

    /*O usuário vai informar uma linguagem de programação e o
    programa deve retornar qual é a versão mais atual da linguagem ou avisar caso não encontre

    Liguagem validas
    JAVA - 17
    KOTLIN - 11
    PHP - 5
    JAVASCRIPT 2.2*/

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Informe uma linguagem");
        Scanner sc = new Scanner(System.in);
        String entradaDeDados = sc.next();
        entradaDeDados = entradaDeDados.toUpperCase();
//        String linguagem = sc.next();
//        linguagem = linguagem.toUpperCase();
        Linguagem lg = Linguagem.valueOf(entradaDeDados);
        sc.close();
        //System.out.println(linguagem);

        switch (lg) {
            case JAVA:
            case KOTLIN:
                System.out.println("A linguagem é compilada");
                break;
            case PHP:
            case JAVASCRIPT:
                System.out.println("A linguagem é interpretada");
                break;
            default:

                System.out.println(entradaDeDados + "linguagem não encontrada");

        }
    }

}
