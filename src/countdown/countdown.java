package countdown;

import java.time.Duration;
import java.time.LocalDateTime;
import java.lang.Thread;

public class countdown {

    public static void main(String[] args) {

        LocalDateTime dataHoje = LocalDateTime.now();
        LocalDateTime midnightTS10 = LocalDateTime.of(2022, 10, 21, 00, 00, 00);
        Duration duracao = Duration.between(dataHoje, midnightTS10);
        System.out.println(duracao.toDaysPart() + " dias " + duracao.toHoursPart() + " horas e " + duracao.toMinutesPart() + " minutos");
        while (!duracao.equals("PT0S")){
            try{
                dataHoje = LocalDateTime.now();
                midnightTS10 = LocalDateTime.of(2022, 10, 21, 00, 00, 00);
                duracao = Duration.between(dataHoje, midnightTS10);
                Thread.sleep(1000*60);
                System.out.println(duracao.toDaysPart() + " dias " + duracao.toHoursPart() + " horas e " + duracao.toMinutesPart() + " minutos");
            }catch (InterruptedException e){
                System.out.println("erro");
            }
        }
    }
}