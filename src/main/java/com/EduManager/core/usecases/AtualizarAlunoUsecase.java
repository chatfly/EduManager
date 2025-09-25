package com.EduManager.core.usecases;

import com.EduManager.core.entities.Aluno;

public interface AtualizarAlunoUsecase {
    public Aluno execute(Long id, Aluno aluno);
}
