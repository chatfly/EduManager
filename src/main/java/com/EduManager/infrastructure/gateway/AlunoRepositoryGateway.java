package com.EduManager.infrastructure.gateway;

import com.EduManager.core.entities.Aluno;
import com.EduManager.core.gateway.AlunoGateway;
import com.EduManager.infrastructure.mapper.AlunoEntityMapper;
import com.EduManager.infrastructure.persistence.AlunoEntity;
import com.EduManager.infrastructure.persistence.AlunoRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AlunoRepositoryGateway implements AlunoGateway {

    private final AlunoRepository alunoRepository;
    private final AlunoEntityMapper alunoEntityMapper;

    public AlunoRepositoryGateway(AlunoRepository alunoRepository, AlunoEntityMapper alunoEntityMapper) {
        this.alunoRepository = alunoRepository;
        this.alunoEntityMapper = alunoEntityMapper;
    }

    @Override
    public Aluno cadastrarAluno(Aluno aluno)
    {
        AlunoEntity alunoEntity = alunoEntityMapper.map(aluno);
        AlunoEntity alunoSalvo = alunoRepository.save(alunoEntity);
        return alunoEntityMapper.map(alunoSalvo);
    }

    @Override
    public List<Aluno> buscarAlunos() {
        List<AlunoEntity> alunos = alunoRepository.findAll();
        return alunos.stream().map(alunoEntityMapper::map).collect(Collectors.toList());
    }

    @Override
    public Aluno atualizarAluno(Long id, Aluno aluno) {
        Optional<AlunoEntity> alunoExistente = alunoRepository.findById(id);
        if(alunoExistente.isPresent()) {
            AlunoEntity alunoAtualizado = alunoEntityMapper.map(aluno);
            alunoAtualizado.setId(id);
            AlunoEntity alunoSalvo = alunoRepository.save(alunoAtualizado);
            return alunoEntityMapper.map(alunoSalvo);
        }
        return null;
    }
}
