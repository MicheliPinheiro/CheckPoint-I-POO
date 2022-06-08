package entities;

import org.w3c.dom.ls.LSOutput;

public class Aluno {

    private int id;
    protected String nome;
    protected String sobrenome;
    private String endereco;
    protected double nota;

    private String tipoAtendimento;

// Construtores

    public Aluno() {

    }

    public Aluno(int id, String nome, String sobrenome, String endereco, double nota, String tipoAtendimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.nota = nota;
        this.tipoAtendimento = tipoAtendimento;
    }

    // Getters and Setters

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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public void aprovacao() {
        if (nota >= 7) {
            System.out.println("O Aluno " + getNome() + " está aprovado");
        }
            else {
                System.out.println("O Aluno " + getNome() + " está reprovado");
            }

    }
    public void consultarAluno(){
        System.out.println("O Aluno " + getNome() + " " + getSobrenome() + " tem nota " + getNota() + "." );

    }

//To String
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nota=" + nota +
                ", tipoAtendimento='" + tipoAtendimento + '\'' +
                '}';
    }
}
