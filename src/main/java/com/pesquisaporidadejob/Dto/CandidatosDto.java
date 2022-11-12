package com.pesquisaporidadejob.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatosDto {

    private UUID id;

    private String nome;

    private String vaga;

    private LocalDate dataNascimento;



}
