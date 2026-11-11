public class Horario {
    private int dia, mes, ano, hora, minuto;

    public Horario(int dia, int mes, int ano, int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprime(){
        System.out.printf("Dia: %02d/%02d/%04d - Horário: %02d:%02d\n", dia, mes, ano, hora, minuto);
    }
}
