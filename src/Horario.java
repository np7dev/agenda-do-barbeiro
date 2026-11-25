import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horario {
    private LocalDateTime date;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Horario(String date){
        setDate(LocalDateTime.parse(date, FORMATO));
    }

    public LocalDateTime getDate(){
        return date;
    }

    public void setDate(LocalDateTime date){
        if(date.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Não é possível marcar horário em uma data que já passou!");
        }
        else
            this.date = date;
    }

    public void imprime(){
        System.out.println(date.format(FORMATO));
    }
}
