package com.EduManager.core.usecases;

import com.EduManager.core.entities.Aluno;
import com.EduManager.core.gateway.AlunoGateway;

import java.util.List;

public class BuscarAlunosUsecaseImpl implements BuscarAlunosUsecase {

    private final AlunoGateway alunoGateway;

    public BuscarAlunosUsecaseImpl(AlunoGateway alunoGateway) {
        this.alunoGateway = alunoGateway;
    }

    @Override
    public List<Aluno> execute()
    {
        return alunoGateway.buscarAlunos();
    }

}
