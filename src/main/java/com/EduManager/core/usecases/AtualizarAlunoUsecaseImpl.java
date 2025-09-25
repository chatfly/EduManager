package com.EduManager.core.usecases;

import com.EduManager.core.entities.Aluno;
import com.EduManager.core.gateway.AlunoGateway;

public class AtualizarAlunoUsecaseImpl implements AtualizarAlunoUsecase{

    private final AlunoGateway alunoGateway;

    public AtualizarAlunoUsecaseImpl(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    @Override
    public Aluno execute(Long id, Aluno aluno) {
        return alunoGateway.atualizarAluno(id, aluno);
    }

}
