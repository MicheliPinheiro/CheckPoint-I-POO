import entities.*;

public class program {
    public static void main(String[] args) {

        Aluno a2 = new Aluno(02, "João", "Santos", "Rua da bica", 5.0, "Hibrido");
        System.out.println(a2);
        a2.aprovacao();
        a2.consultarAluno();

        Aluno a1 = new Aluno(01, "Jorge", "Silva", "Rua do alto", 7.9, "Remoto");
        System.out.println(a1);
        a1.aprovacao();
        a1.consultarAluno();

        ProfessorRegente p1 = new ProfessorRegente(01, "Marcelo", "Gonçalvez", 01, "POO");
        System.out.println(p1);
        p1.situacaoProfessor();

        ProfessorTutor p2 = new ProfessorTutor(02, "João", "Vitor", 02, "Tutoria");
        System.out.println(p2);
        p2.situacaoProfessor();
    }
}




