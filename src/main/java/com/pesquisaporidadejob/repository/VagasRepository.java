package com.pesquisaporidadejob.repository;

import com.pesquisaporidadejob.entity.Candidatos;
import com.pesquisaporidadejob.entity.Vagas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VagasRepository extends JpaRepository<Vagas, UUID> {


}
