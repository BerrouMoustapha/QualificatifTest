package fr.univbrest.dosi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Qualificatif;

import java.util.List;

public interface QualificatifRepository extends JpaRepository<Qualificatif, Integer>{

}
