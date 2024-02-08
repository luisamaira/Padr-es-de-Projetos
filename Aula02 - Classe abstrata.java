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

abstract class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void matricular();
    
    public abstract void cancelarMatricula();
}

public class AlunoImplementacao extends Aluno {

    public AlunoImplementacao(String nome) {
        super(nome);
    }

    @Override
    public void matricular() {
        System.out.println(getNome() + " foi matriculado na disciplina.");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println(getNome() + " teve sua matrícula cancelada.");
    }
}

public class Disciplina {

    private String nome;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String nome) {
        this.nome = nome;
        this.alunosMatriculados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    // Método concreto para adicionar um aluno à disciplina
    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        aluno.matricular();
    }

    // Método concreto para remover um aluno da disciplina
    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
        aluno.cancelarMatricula();
    }
}

public class DisciplinaImplementacao extends Disciplina {

    public DisciplinaImplementacao(String nome) {
        super(nome);
    }
}

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new AlunoImplementacao("Luísa");
        Aluno aluno2 = new AlunoImplementacao("Maria");

        Disciplina disciplina = new DisciplinaImplementacao("Padrões de Projeto");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);

        disciplina.removerAluno(aluno1);
    }
}
