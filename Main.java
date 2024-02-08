/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luísa Maira
 */
interface Aluno {

    void matricular();

    void cancelarMatricula();
}

// Interface para representar uma disciplina
interface Disciplina {

    void adicionarAluno(Aluno aluno);

    void removerAluno(Aluno aluno);
}

// Implementação da classe Aluno
public class AlunoImplementacao implements Aluno {

    private String nome;

    public AlunoImplementacao(String nome) {
        this.nome = nome;
    }

    @Override
    public void matricular() {
        System.out.println(nome + " matriculado na disciplina.");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println(nome + " teve sua matrícula cancelada.");
    }
}

// Implementação da classe Disciplina
public class DisciplinaImplementacao implements Disciplina {

    private String nome;
    private List<Aluno> alunosMatriculados;

    public DisciplinaImplementacao(String nome) {
        this.nome = nome;
        this.alunosMatriculados = new ArrayList<>();
    }

    @Override
    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        aluno.matricular();
    }

    @Override
    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
        aluno.cancelarMatricula();
    }
}

// Exemplo de uso
public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new AlunoImplementacao("João");
        Aluno aluno2 = new AlunoImplementacao("Maria");

        Disciplina disciplina = new DisciplinaImplementacao("Programação Java");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        disciplina.removerAluno(aluno1);
    }
}
