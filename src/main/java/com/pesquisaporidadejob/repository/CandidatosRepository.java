package com.pesquisaporidadejob.repository;

import com.pesquisaporidadejob.entity.Candidatos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.UUID;

@Repository
public interface CandidatosRepository extends JpaRepository<Candidatos, UUID> {



   // @Query(value = "select d from Candidatos d  " +
     //              "where YEAR (d.dataNascimento) = ?1 and YEAR(d.dataNascimento) = ?2  ")
   Page<Candidatos> findByDataNascimentoBetween(LocalDate anoDataNascimento, LocalDate nascimento2, Pageable pageable);



}
