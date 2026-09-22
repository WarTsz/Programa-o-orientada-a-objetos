import java.util.ArrayList;
public class Academia {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    final static private String[] dias = {"Domingo","Segunda","Terca","Quarta","Quinta","Sexta","Sabado"};
    private void RegistrarAluno(Aluno novoaluno) {
        alunos.add(novoaluno);
        System.out.println("Novo aluno registrado com sucesso.");
    }
    private boolean Verificar() {
        if (alunos.size() == 0) {
            System.out.println("Sem alunos matriculados");
            return false;
        }
        return true;
    }
    private Plano gerar_new_plano(double mensalidade,int dia,int integrantes,String tipo) {
        Plano plano;
        try {
        if (tipo=="anual") {
            plano = new PlanoAnual(mensalidade, dia);
        }
        else if (tipo == "familia") {
            plano = new PlanoFamilia(mensalidade, dia,integrantes);
        }
        else {
            plano = new Plano(mensalidade,dia);
        }
        return plano;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());}
            return null;}
    public Aluno gerar_new_aluno(String nome,int idade,double mensalidade,int dia,int integrantes,String tipo) {
        try {
            Aluno aluno = new Aluno(nome,idade,gerar_new_plano(mensalidade, dia, integrantes, tipo));
            RegistrarAluno(aluno);
            return aluno;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());}
        return null;}
    public void ReceitaTotal() {
        if (Verificar() == false) {
            System.out.println("Valor total: "+0+"\n");
            return;}
        double Total = 0;
        for (int index=0;index<alunos.size();index++) {
            Total+=alunos.get(index).ValorDaMensalidade();
        }
        System.out.println("Valor total: "+Total+"\n");
    }
    public void MatriculaMaisCara() {
        if (Verificar() == false) {
            return;}
        double MaisCara = alunos.get(0).ValorDaMensalidade();
        for (int index=1; index<alunos.size();index++) {
            if (alunos.get(index).ValorDaMensalidade() > MaisCara) {
                MaisCara = alunos.get(index).ValorDaMensalidade();
            }
        }
        System.out.println("Matricula mais cara: "+MaisCara+"\n");
    }
    public void DiaMaisMovimentado() {
        if (Verificar() == false) {
            return;}
        int[] CountDays = {0,0,0,0,0,0,0};
        for (int i=0;i<alunos.size();i++) {
            int diasemana = alunos.get(i).DiaDaMatricula();
            CountDays[diasemana]+=1;}
        int MaisMov = CountDays[0];
        for (int i=1;i<CountDays.length;i++) {
            if (CountDays[i]>MaisMov) {
                MaisMov = CountDays[i];
            }
        }
        System.out.println("Dia mais movimentado: "+dias[MaisMov]);
    }
    public void GetDados() {
        ReceitaTotal();
        DiaMaisMovimentado();
        MatriculaMaisCara();
    }
}