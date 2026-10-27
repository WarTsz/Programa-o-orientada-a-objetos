package Modelo;
import Exceptions.PrecoInvalidoException;
public class Produto {
    private String nome;
    private String marca;
    private float tamanho;
    private double preco;
    public Produto(String Nome,String Marca,float Tamanho,double Preco) throws PrecoInvalidoException{
        if (Preco<=0) {
            throw new PrecoInvalidoException();
        }
        this.nome = Nome;
        this.marca = Marca;
        this.tamanho = Tamanho;
        this.preco = Preco;
    }
    public String getMarca() {
        return marca;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public float getTamanho() {
        return tamanho;
    }
}