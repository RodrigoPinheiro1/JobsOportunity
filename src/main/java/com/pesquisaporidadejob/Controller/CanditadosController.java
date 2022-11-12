package com.pesquisaporidadejob.Controller;


import com.pesquisaporidadejob.Dto.CandidatosDto;
import com.pesquisaporidadejob.Dto.VagasDto;
import com.pesquisaporidadejob.service.CandidatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.time.LocalDate;

@RestController
@RequestMapping("/candidatos")
public class CanditadosController {


    @Autowired
    private CandidatosService service;


    @GetMapping
    public Page<CandidatosDto> paginacaoComIdade(@RequestParam(required = false)
                                                 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromAge,
                                                 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                                 @RequestParam(required = false) LocalDate toAge,
                                                 @PageableDefault(sort = "id", direction = Sort.Direction.DESC,
                                                         page = 0, size = 10) Pageable pageable) {


        return service.paginacaoIdade(pageable, fromAge, toAge);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<VagasDto> cadastrar(@RequestBody VagasDto dto, UriComponentsBuilder uriComponentsBuilder) {

        VagasDto cadastrar = service.cadastrar(dto);

        URI uri = uriComponentsBuilder.path("/candidatos").buildAndExpand(cadastrar.getId()).toUri();
        return ResponseEntity.created(uri).body(cadastrar);
    }


}
