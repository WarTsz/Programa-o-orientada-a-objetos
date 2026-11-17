package secretaria.notificador;

import app.Colors;
import users.funcionario.Professor;

public class NotificadorConsole implements Notificador {
    @Override
    public void enviar(Professor professor) {
        String dados = "Nome: "+professor.getNome()+"Idade: "+String.format("%d",professor.getIdade())+"CPF: "+professor.getCpf()+"\n";
        Object notas = professor.getNotificacoes();
        Colors.print(dados, null);
        Colors.print(notas, "CYAN");
        
    }
    
}