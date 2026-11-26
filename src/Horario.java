    import java.time.LocalDate;
    import java.time.LocalTime;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;

    public class Horario {
        private LocalDate date;
        private LocalTime time;

        private static final DateTimeFormatter FORMAT_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        private static final DateTimeFormatter FORMAT_TIME = DateTimeFormatter.ofPattern("HH:mm");

        public Horario(String date, String time){
            setDate(LocalDate.parse(date, FORMAT_DATE));
            setTime(LocalTime.parse(time, FORMAT_TIME));
        }

        public LocalDate getDate(){
            return date;
        }

        public void setDate(LocalDate date){
            if (this.time != null && LocalDateTime.of(date, this.time).isBefore(LocalDateTime.now())){
                throw new IllegalArgumentException("Não é possível marcar horário em uma data que já passou!");
            }
            this.date = date;
        }

        public LocalTime getTime(){
            return time;
        }

        public void setTime(LocalTime time){
            if(this.date != null && LocalDateTime.of(this.date, time).isBefore(LocalDateTime.now())){
                throw new IllegalArgumentException("Não é possível marcar em um horário que já passou!");
            }
            this.time = time;
        }

        public void imprime(){
            System.out.println("Dia: "+date.format(FORMAT_DATE));
            System.out.println("Horário: "+time.format(FORMAT_TIME));
        }
    }
