package fr.aberwag.universite.etudiant.controller;

import java.util.List;

import fr.aberwag.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {
	public List<Etudiant> findAll();
	
	public Etudiant findOne(Integer id);
	
	public Etudiant save(Etudiant etudiant);
}
