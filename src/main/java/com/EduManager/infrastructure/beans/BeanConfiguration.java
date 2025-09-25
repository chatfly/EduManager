package com.EduManager.infrastructure.beans;

import com.EduManager.core.gateway.AlunoGateway;
import com.EduManager.core.usecases.*;
import com.EduManager.infrastructure.gateway.AlunoRepositoryGateway;
import com.EduManager.infrastructure.mapper.AlunoEntityMapper;
import com.EduManager.infrastructure.persistence.AlunoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public AlunoGateway alunoGateway(AlunoRepository alunoRepository, AlunoEntityMapper alunoEntityMapper) {
        return new AlunoRepositoryGateway(alunoRepository, alunoEntityMapper);
    }

    @Bean
    public CadastrarAlunoUsecase cadastrarAluno(AlunoGateway alunoGateway) {
        return new CadastrarAlunoUsecaseImpl(alunoGateway);
    }

    @Bean
    public BuscarAlunosUsecase buscarAlunosUsecase(AlunoGateway alunoGateway) {
        return new BuscarAlunosUsecaseImpl(alunoGateway);
    }

    @Bean
    public AtualizarAlunoUsecase atualizarAlunoUsecase(AlunoGateway alunoGateway) {
        return new AtualizarAlunoUsecaseImpl(alunoGateway);
    }

}
