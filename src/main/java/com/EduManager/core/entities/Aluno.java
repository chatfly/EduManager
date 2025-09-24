package com.EduManager.core.entities;

import java.util.Date;

public record Aluno(Long id, String nome, String cpf, Date dataNascimento) {
}
