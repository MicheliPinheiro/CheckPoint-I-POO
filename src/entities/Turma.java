package entities;
import entities.Aluno;

public class Turma {

    private int id;
    private int numeroAluno;

    public Turma(){

    }
// Construtor
    public Turma(int id, int numeroAluno) {
        this.id = id;
        this.numeroAluno = numeroAluno;

    }
// Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    //Método


    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", numeroAluno=" + numeroAluno +
                '}';
    }
}
