package com.pesquisaporidadejob.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vagas {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id = UUID.randomUUID();

    private String recrutador;

    private LocalDate dtAberturaVaga;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private List<Candidatos> candidatos;




}
