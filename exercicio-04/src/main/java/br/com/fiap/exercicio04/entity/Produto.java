package br.com.fiap.exercicio04.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="produto", sequenceName = "SQ_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(generator = "produto",strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private double preco;
    private boolean novo;
    private LocalDate dataFabricacao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
