package com.pesquisaporidadejob.Dto;

import com.pesquisaporidadejob.entity.Candidatos;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.rmi.server.UID;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class VagasDto {


    private UUID id;
    private String recrutador;

    private LocalDate dtAberturaVaga;

    private List<CandidatosDto> candidatos;
}
