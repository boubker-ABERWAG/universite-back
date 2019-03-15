package fr.aberwag.universite.matiere.controller;

import java.util.List;

import fr.aberwag.universite.matiere.domain.Matiere;

public interface IMatiereController {
	public List<Matiere> findAll();
	
	public Matiere findOne(Integer id);
	
	public Matiere save(Matiere matiere);
}
