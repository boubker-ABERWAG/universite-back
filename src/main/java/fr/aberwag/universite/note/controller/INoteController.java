package fr.aberwag.universite.note.controller;

import java.util.List;

import fr.aberwag.universite.note.domain.Note;

public interface INoteController {
	
	public List<Note> findAll();
	
	public Note findOne(Integer idEtudiant, Integer idMatiere);
	
	public Note save(Note note);
}
