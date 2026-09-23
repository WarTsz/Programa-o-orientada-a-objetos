public class Principal {
    public static void main(String[] args) {
        Transportadora RotaCerta = new Transportadora("RotaCerta");
        Destinatario d1 = new Destinatario("Ana Souza", "Rua das Flores, 123 - SP", "111.222.333-44");
        Destinatario d2 = new Destinatario("Carlos Silva", "Av. Central, 456 - RJ", "222.333.444-55");
        Destinatario d3 = new Destinatario("Mariana Oliveira", "Praça da Sé, 789 - BA", "333.444.555-66");
        Destinatario d4 = new Destinatario("Lucas Santos", "Rua XV, 1010 - PR", "444.555.666-77");
        Destinatario d5 = new Destinatario("Beatriz Lima", "Alameda, 202 - MG", "555.666.777-88");
        Destinatario d6 = new Destinatario("Gabriel Costa", "Rodovia, 50 - SC", "666.777.888-99");
        try {
            RotaCerta.GerarEncomenda(d1, 3.5, "Normal", 1001);
            System.out.println("Sucesso: Encomenda Normal gerada!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d2, 5.0, "Expressa", 1002);
            System.out.println("Sucesso: Encomenda Expressa gerada!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d3, 1.2, "Fragil", 1003);
            System.out.println("Sucesso: Encomenda Frágil gerada!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d4, 4.0, "Normal", 1004);
            System.out.println("Sucesso: Encomenda Normal gerada!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d5, 2.0, "Normal", 1001);
            System.out.println("Sucesso: Encomenda gerada!");
        } catch (Exception e) {
            System.out.println("Exceção capturada (Código Repetido): " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d6, 6.0, "Fragil", 1002);
            System.out.println("Sucesso: Encomenda gerada!");
        } catch (Exception e) {
            System.out.println("Exceção capturada (Código Repetido): " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d1, 12.5, "Expressa", 1005);
            System.out.println("Sucesso: Encomenda gerada!");
        } catch (Exception e) {
            System.out.println("Exceção capturada (Peso Expressa Inválido): " + e.getMessage());
        }
        try {
            RotaCerta.GerarEncomenda(d2, -25.0, "Normal", 1006);
            System.out.println("Sucesso: Encomenda gerada!");
        } catch (Exception e) {
            System.out.println("Exceção capturada (Peso Negativo): " + e.getMessage());
        }

        try {
            RotaCerta.GerarEncomenda(d3, 3.0, "Bolsonaro", 1007);
            System.out.println("Sucesso: Encomenda gerada!");
        } catch (Exception e) {
            System.out.println("Exceção capturada (Tipo Inexistente): " + e.getMessage());
        }
    }
}