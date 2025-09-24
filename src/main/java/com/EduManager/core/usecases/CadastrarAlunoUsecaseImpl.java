package com.EduManager.core.usecases;

import com.EduManager.core.entities.Aluno;
import com.EduManager.core.gateway.AlunoGateway;

public class CadastrarAlunoUsecaseImpl implements CadastrarAlunoUsecase {

    private final AlunoGateway alunoGateway;

    public CadastrarAlunoUsecaseImpl(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    @Override
    public Aluno execute(Aluno aluno) {
        return alunoGateway.cadastrarAluno(aluno);
    }
}
