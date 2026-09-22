public class Principal {
    public static void main(String[] args) {
        Academia FitPower = new Academia();
        Aluno Joao = FitPower.gerar_new_aluno("Joao",27,89,4,1,"mensal");
        Aluno Maria = FitPower.gerar_new_aluno("Maria", 23, 100, 2, 1, "anual");
        Aluno Pedro = FitPower.gerar_new_aluno("Pedro", 50, 79.99, 1, 011, "familia");
    }
    }