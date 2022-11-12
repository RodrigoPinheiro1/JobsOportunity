package com.pesquisaporidadejob.service;

import com.pesquisaporidadejob.Dto.CandidatosDto;
import com.pesquisaporidadejob.Dto.VagasDto;
import com.pesquisaporidadejob.entity.Candidatos;
import com.pesquisaporidadejob.entity.Vagas;
import com.pesquisaporidadejob.repository.CandidatosRepository;
import com.pesquisaporidadejob.repository.VagasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class CandidatosService implements CanditadoInterface {


    @Autowired
    private CandidatosRepository candidatosRepository;


    @Autowired
    private VagasRepository vagasRepository;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<CandidatosDto> paginacaoIdade(Pageable pageable, LocalDate fromAge, LocalDate toAge) {


        return candidatosRepository.findByDataNascimentoBetween(fromAge, toAge, pageable)
                .map(candidatos -> modelMapper.map(candidatos, CandidatosDto.class));

    }
    public void converter (LocalDate fromAge , LocalDate toAge){

        fromAge.getYear();
        int year = toAge.getYear();

    }

    @Override
    public VagasDto cadastrar(VagasDto dto) {

        Vagas vagas = modelMapper.map(dto, Vagas.class);

        vagasRepository.save(vagas);

        return modelMapper.map(vagas, VagasDto.class);

    }


}
