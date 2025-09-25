package com.EduManager.core.gateway;

import com.EduManager.core.entities.Aluno;

import java.util.List;

public interface AlunoGateway {

    public Aluno cadastrarAluno(Aluno aluno);
    public List<Aluno> buscarAlunos();
    public Aluno atualizarAluno(Long id, Aluno aluno);

}
