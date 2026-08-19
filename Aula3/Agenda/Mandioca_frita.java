import java.time.LocalDate;
public class Mandioca_frita {
    public static void main(String[] args) {
        Paciente Paciente01 = new Paciente("Pedro","");
        Paciente Paciente02 = new Paciente("Julia","");
        LocalDate agora = LocalDate.of(2026,9,23);
        Consulta Consulta01 = new Consulta(Paciente01,agora,250);
        Consulta Consulta02 = new Consulta(Paciente02,agora,400);
        Consulta01.exibir_comprovante(Consulta01);
        Consulta02.exibir_comprovante(Consulta02);}
}