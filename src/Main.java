import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        Cliente c1 = new Cliente("Zoro", "(11) 940028922");
        Horario t1 = new Horario("29/11/2026", "01:00");
        t1.imprime();
        c1.imprime();
    }
}