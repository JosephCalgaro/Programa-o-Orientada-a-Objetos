package pkg;

import java.util.Scanner;

public class ex6_metodos {
    
    public static void main(String[] args) {

        // Objeto 1 → construtor (nome + matrícula)
        aluno a1 = new aluno("João", "12345");

        // Objeto 2 → construtor (data nascimento)
        aluno a2 = new aluno("01/01/2000");

        // Objeto 3 → construtor completo
        aluno a3 = new aluno("Maria", "02/02/2001", 2023);
    }
}
