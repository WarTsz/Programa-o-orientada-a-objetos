public class Titular {
    private String nome;
    private String CPF;
    private String data_nasc;
    Titular (String newname, String newCPF, String newData) {
        this.nome = newname;
        this.CPF = newCPF;
        this.data_nasc = newData;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public String getData_nasc() {
        return data_nasc;
    }
}