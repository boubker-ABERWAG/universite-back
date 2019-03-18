package fr.aberwag.universite.etudiant.service;

import java.util.List;

import fr.aberwag.universite.etudiant.domain.Etudiant;

public interface IEtudiantService {
	public List<Etudiant> findAll();
	
	public Etudiant findOne(Integer id);
	
	public Etudiant save(Etudiant etudiant);
	public Etudiant update(Etudiant etudiant);
	
	public void supprimer(Integer id);
}
