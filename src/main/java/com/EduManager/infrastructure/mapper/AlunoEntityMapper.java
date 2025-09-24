package com.EduManager.infrastructure.mapper;

import com.EduManager.core.entities.Aluno;
import com.EduManager.infrastructure.dtos.AlunoDTO;
import org.springframework.stereotype.Component;

@Component
public class AlunoEntityMapper {

    public Aluno map(AlunoDTO dto)
    {
        return new Aluno(
            dto.getId(),
            dto.getNome(),
            dto.getCpf(),
            dto.getDataNascimento()
        );
    }

    public AlunoDTO map(Aluno aluno)
    {
        return new AlunoDTO(
            aluno.id(),
            aluno.nome(),
            aluno.cpf(),
            aluno.dataNascimento()
        );
    }
}
