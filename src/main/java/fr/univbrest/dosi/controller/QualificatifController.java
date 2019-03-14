package fr.univbrest.dosi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Qualificatif;
import fr.univbrest.dosi.exception.ResourceNotFoundException;
import fr.univbrest.dosi.repository.QualificatifRepository;



@RestController
@RequestMapping("/qaulificatif")
public class QualificatifController {
	
	QualificatifRepository repository;

    
    // Get All Qualificatifs
    @GetMapping("/qualificatifs")
    public List<Qualificatif> getAllQualificatifs() {
        return repository.findAll();
    }

    // Create a new Qualificatif
    @PostMapping("/qualificatif")
    public Qualificatif createQualificatif(@Valid @RequestBody Qualificatif qualificatif) {
        return repository.save(qualificatif);
    }


    // Get a Single Qualificatif By Id
    @GetMapping("/qualificatif/{id}")
    public Qualificatif getQualificatifById(@PathVariable(value = "id") int idQualificatif) {
        return repository.findById(idQualificatif)
                .orElseThrow(() -> new ResourceNotFoundException("idQualificatif", "idQualificatif", idQualificatif));
    }
 // Update Qualificatif By Id
   /* @PutMapping("/qualificatif/{id}")
    public ResponseEntity<Object> updateQualificatif(@RequestBody Qualificatif qualificatif, @PathVariable int idQualificatif) {

    	Optional<Qualificatif> qualificatifOptional = repository.findById(idQualificatif);

    	if (!qualificatifOptional.isPresent())
    		return ResponseEntity.notFound().build();

    	qualificatif.setIdQualificatif(idQualificatif);
    	
    	repository.save(qualificatif);

    	return ResponseEntity.noContent().build();
    }*/


}
