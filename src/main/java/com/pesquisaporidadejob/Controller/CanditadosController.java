package com.pesquisaporidadejob.Controller;


import com.pesquisaporidadejob.service.CandidatosService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("candidados")
public class CanditadosController {


    private CandidatosService service;


}
