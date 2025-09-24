package com.EduManager.infrastructure.presentation;

import com.EduManager.core.usecases.CadastrarAlunoUsecase;
import com.EduManager.infrastructure.dtos.AlunoDTO;
import com.EduManager.infrastructure.gateway.AlunoRepositoryGateway;
import com.EduManager.infrastructure.mapper.AlunoDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class AlunoController {

    private final AlunoDtoMapper alunoDtoMapper;
    private final CadastrarAlunoUsecase cadastrarAlunoUsecase;

    public AlunoController(AlunoDtoMapper alunoDtoMapper, CadastrarAlunoUsecase cadastrarAlunoUsecase) {
        this.alunoDtoMapper = alunoDtoMapper;
        this.cadastrarAlunoUsecase = cadastrarAlunoUsecase;
    }

    @PostMapping("cadastraraluno")
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO aluno) {
        return alunoDtoMapper.map(cadastrarAlunoUsecase.execute(alunoDtoMapper.map(aluno)));
    }

}
