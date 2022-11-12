package com.pesquisaporidadejob.service;

import com.pesquisaporidadejob.Dto.CandidatosDto;
import com.pesquisaporidadejob.Dto.VagasDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

public interface CanditadoInterface {


    Page<CandidatosDto> paginacaoIdade(Pageable pageable, LocalDate fromAgre, LocalDate toAge);

    VagasDto cadastrar(VagasDto dto);
}
