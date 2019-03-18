package fr.aberwag.universite.etudiant.controller.impl;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.aberwag.universite.etudiant.controller.IEtudiantController;
import fr.aberwag.universite.etudiant.domain.Etudiant;
import fr.aberwag.universite.etudiant.service.impl.EtudiantServiceImpl;

@RestController
public class ETduaintControllerImpl
implements IEtudiantController
{
	@Autowired
	EtudiantServiceImpl etudiantService;

	@Override
	@GetMapping("/etudiants")
	public List<Etudiant> findAll() {
		List<Etudiant> listeEtudiants = etudiantService.findAll();
		return listeEtudiants;
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant findOne(@PathVariable Integer id) {
		Etudiant etudiant = etudiantService.findOne(id);
		return etudiant;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant save(@RequestBody Etudiant etudiant) {
		Etudiant e = etudiantService.save(etudiant);
		return e;
	}

	@Override
	@DeleteMapping("/etudiants/{id}")
	public void delete(@PathVariable Integer id) {
		etudiantService.supprimer(id);	
	}

	@Override
	@PutMapping("/etudiants/{id}")
	public Etudiant update(
			@RequestBody Etudiant etudiant, 
			@PathVariable Integer id
		) {
		etudiant.setId(id);
		Etudiant e = etudiantService.save(etudiant);
		return e;
	}

}
