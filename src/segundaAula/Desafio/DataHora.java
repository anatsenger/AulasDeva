package segundaAula.Desafio;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime; //O tempo é representado com precisão de nanossegundos, não armazena nem representa uma data ou fuso horário
//não pode representar um instante na linha do tempo sem informações adicionais, como deslocamento ou fuso horário.
import java.time.format.DateTimeFormatter;
import java.util.Date; //representa um instante específico no tempo, com precisão de milissegundos.
import java.util.Locale; // para informações que podem mudar de acordo com o local
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* Desafio DataHora.

Vamos treinar o switch case nesse desafio.

Crie um programa que dê ao usuário opções de escolher data e hora
exibindo com formatações diferentes. Pegue como base o Exemplo da classe 'DataHora'.

O intuito é você trabalhar com classes existente no java, como por exemplo,
- LocalDate
- DateFormat
- LocalDateTime
- LocalTime
- Locale (Opcional) */
public class DataHora {

    public static void main(String[] args) {


        System.out.println("------------------------------------------------");
        System.out.println("Para saber a data da sua consulta digite 'data'\n" +
                "Para saber o horario da sua consulta digite 'hora': ");
        Scanner sc = new Scanner(System.in);
        String entradaDeDados = sc.next();
        System.out.println("------------------------------------------------");
        Locale brasil = new Locale("pt", "BR");

            switch (entradaDeDados.toLowerCase()) {
                case "data":
                    System.out.println("A data da sua consulta é: " + DateFormat.getDateInstance().format(new Date()));
                    Date data = new Date();
                    System.out.printf(brasil, "A data da sua consulta é: %1$tA, %1$td de %1$tB de %1$tY %n ", data);
                    break;
                case "hora":
                    System.out.println("Sua consulta está marcada no horário:  " + DateFormat.getTimeInstance()
                            .format(new Date()));
                    //Date hora = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
                    //System.out.printf("Exemplo usando printf: %tT%n", hora);
                    System.out.println("Exemplo usando LocalTime: " + LocalTime.now().format(DateTimeFormatter
                            .ofPattern("hh:mm:ss")));
                    break;
                case "dia":
                    String diaEHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE, d. MMM yyyy", brasil));
                    System.out.println(diaEHora);
                    int hour = LocalTime.now().getHour();
                    System.out.println(hour);

                    //adicionado dias ou horas
                    LocalDate localDate = LocalDate.now().plusDays(1).plusMonths(1);
                    LocalDateTime localDateTime = LocalDateTime.now().plusDays(1).plusMonths(1).plusHours(2);
                    System.out.println("adicionando dias: "+ localDate);
                    System.out.println("adicionando dias e horas: "+ localDateTime);

                    //data específica:
                    LocalDate MidnightTS = LocalDate.of(2022, 10, 21);
                    System.out.printf(brasil, "%1$tA, %1$td de %1$tB de %1$tY %n", MidnightTS);
                    DateFormat hj = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
                    System.out.println(hj);
                    LocalDate hoje = LocalDate.now();
                    //LocalDate tempoFalta = MidnightTS - hoje;
                    long DiasQueFaltam = ChronoUnit.DAYS.between(hoje, MidnightTS);
                    System.out.println(DiasQueFaltam);

                    break;
            }

    }
}