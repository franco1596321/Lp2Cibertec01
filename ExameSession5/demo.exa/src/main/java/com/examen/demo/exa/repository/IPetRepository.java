package com.examen.demo.exa.repository;

import com.examen.demo.exa.model.PetProf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository  extends JpaRepository<PetProf,Integer>{



}
