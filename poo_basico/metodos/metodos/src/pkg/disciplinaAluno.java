package pkg;

public class disciplinaAluno {
   String nome;
   int cargaHoraria;
   String nomeProfessor;

   public disciplinaAluno() {
   }

   public void inserirDados(String nome, int cargaHoraria, String nomeProfessor) {
      this.nome = nome;
      this.cargaHoraria = cargaHoraria;
      this.nomeProfessor = nomeProfessor;
   }

   public void alunoInfo() {
      System.out.println("Nome do aluno: " + this.nome);
      System.out.println("Carga horária: " + this.cargaHoraria);
      System.out.println("Nome do professor: " + this.nomeProfessor);
   }
}
