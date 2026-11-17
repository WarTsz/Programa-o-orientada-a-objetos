package secretaria;
import java.util.ArrayList;

import app.Colors;
import secretaria.boletim.GeradorBoletim;
import secretaria.notificador.Notificador;
import users.funcionario.Professor;
public class Central {
    private GeradorBoletim formato;
    private Notificador notificadorFormato;
    private ArrayList<Professor> professores = new ArrayList<>();
    private final static int bimestres = 4;
    public Central(GeradorBoletim formato,Notificador notificadorFormato) throws IllegalArgumentException{
        if (formato == null) {
            throw new IllegalArgumentException("O formato deve existir");
        }
        this.formato = formato;
        this.notificadorFormato = notificadorFormato;
    }
    public void addProfessor(Professor professor) throws IllegalArgumentException{
        if (professor == null) {
            throw new IllegalArgumentException("O professor deve existir");
        }
        this.professores.add(professor);
    }
    public void gerarBoletins() {
        if (professores.size() == 0) {
            Colors.print("Não há professores catalogados","RED");
            return;
        }
        for (int i=0;i<professores.size();i++) {
            for (int j=0;j<professores.get(i).getAlunos().size();j++) {
                if (professores.get(i).getAlunos().get(j).getNotas().size() <4) {
                    Colors.print("O aluno não possui todas as notas nos bimestres requeridos\nGerando mensagem de erro...","RED");
                    for (int k=3;k>=professores.get(i).getAlunos().get(j).getNotas().size();k--) {
                        professores.get(i).getNotificacoes().add("NOME:"+professores.get(i).getAlunos().get(j).getNome()+"\nIDADE:"+professores.get(i).getAlunos().get(j).getIdade()+"\nCPF:"+professores.get(i).getAlunos().get(j).getCpf()+"\nBimestre faltando:"+(String.format("%d",k+1))+"\n");

                    }
                }
                else {
                    formato.enviar(professores.get(i).getAlunos().get(j));}
        }
    }
    }
    public void notificarProfessores() {
        for (int i=0;i<professores.size();i++) {
            if (professores.get(i).getNotificacoes().size() > 0){
                notificadorFormato.enviar(professores.get(i));
            }
        }
    }
    
}