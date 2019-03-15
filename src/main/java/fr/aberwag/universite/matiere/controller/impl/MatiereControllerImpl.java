package fr.aberwag.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.aberwag.universite.matiere.controller.IMatiereController;
import fr.aberwag.universite.matiere.domain.Matiere;
import fr.aberwag.universite.matiere.service.impl.MatiereServiceImpl;

@RestController
public class MatiereControllerImpl 
implements IMatiereController
{

	@Autowired
	MatiereServiceImpl matiereService;
	
	@Override
	@GetMapping("/matieres")
	public List<Matiere> findAll() {
		List<Matiere> listeMatiere = matiereService.findAll();
		return listeMatiere;
	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere findOne(@PathVariable Integer id) {
		Matiere matiere  = matiereService.findOne(id);
		return matiere;
	}

	@Override
	@PostMapping("/matieres")
	public Matiere save(@RequestBody Matiere matiere) {
		Matiere m = matiereService.save(matiere);
		return m;
	}

}



