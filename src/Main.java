import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String nome, cel, date, time;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe nome e telefone do cliente");
        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Cel: ");
        cel = input.nextLine();

        System.out.println("\nInforme dia e horário");
        System.out.print("Dia: ");
        date = input.nextLine();
        System.out.print("Horário: ");
        time = input.nextLine();

        Cliente c1 = new Cliente(nome, cel);
        Horario t1 = new Horario(date, time);
        t1.imprime();
        c1.imprime();
    }
}