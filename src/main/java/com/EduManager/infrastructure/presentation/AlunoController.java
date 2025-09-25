package com.EduManager.infrastructure.presentation;

import com.EduManager.core.usecases.BuscarAlunosUsecase;
import com.EduManager.core.usecases.CadastrarAlunoUsecase;
import com.EduManager.infrastructure.dtos.AlunoDTO;
import com.EduManager.infrastructure.gateway.AlunoRepositoryGateway;
import com.EduManager.infrastructure.mapper.AlunoDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class AlunoController {

    private final AlunoDtoMapper alunoDtoMapper;
    private final CadastrarAlunoUsecase cadastrarAlunoUsecase;
    private final BuscarAlunosUsecase buscarAlunosUsecase;

    public AlunoController(AlunoDtoMapper alunoDtoMapper, CadastrarAlunoUsecase cadastrarAlunoUsecase, BuscarAlunosUsecase buscarAlunosUsecase) {
        this.alunoDtoMapper = alunoDtoMapper;
        this.cadastrarAlunoUsecase = cadastrarAlunoUsecase;
        this.buscarAlunosUsecase = buscarAlunosUsecase;
    }

    @PostMapping("cadastraraluno")
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO aluno) {
        return alunoDtoMapper.map(cadastrarAlunoUsecase.execute(alunoDtoMapper.map(aluno)));
    }

    @GetMapping("buscaralunos")
    public List<AlunoDTO> buscarAlunos() {
        return buscarAlunosUsecase.execute().stream().map(alunoDtoMapper::map).collect(Collectors.toList());
    }
}
