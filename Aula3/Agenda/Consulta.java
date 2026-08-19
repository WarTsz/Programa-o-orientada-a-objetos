import java.time.LocalDate;
public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;
    Consulta(Paciente paciente_atual,LocalDate data_atual,double valor_atual) {
        paciente = paciente_atual;
        data = data_atual;
        valor = valor_atual;}
    void exibir_comprovante(Consulta consulta_atual) {
        System.out.println("\nConsulta Atual:\nPaciente:"+consulta_atual.paciente.nome+"\nData:"+consulta_atual.data+"\nValor"+consulta_atual.valor+"\n");}
}