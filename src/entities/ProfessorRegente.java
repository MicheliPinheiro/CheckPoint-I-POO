package entities;

public class ProfessorRegente extends Professor {

    private int id;

    private String disciplina;

    //Construtores

    public ProfessorRegente() {

    }

    public ProfessorRegente(int id, String nome, String sobrenome, int id1, String disciplina) {
        super(id, nome, sobrenome);
        this.id = id1;
        this.disciplina = disciplina;
    }
    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //Método

    public void situacaoProfessor(){
        System.out.println("O Professor " + getNome() +" " + getSobrenome() + " leciona a disciplina " + getDisciplina() + ".");
    }


    // To String

    @Override
    public String toString() {
        return super.toString() +
                "ProfessorRegente{" +
                "id=" + id +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }
}
