package com.EduManager.infrastructure.mapper;

import com.EduManager.core.entities.Aluno;
import com.EduManager.infrastructure.persistence.AlunoEntity;
import org.springframework.stereotype.Component;

@Component
public class AlunoDtoMapper {

    public AlunoEntity map(Aluno aluno) {
        return new AlunoEntity(
            aluno.id(),
            aluno.nome(),
            aluno.cpf(),
            aluno.dataNascimento()
        );
    }

    public Aluno map(AlunoEntity alunoEntity) {
        return new Aluno(
            alunoEntity.getId(),
            alunoEntity.getNome(),
            alunoEntity.getCpf(),
            alunoEntity.getDataNascimento()
        );
    }

}
