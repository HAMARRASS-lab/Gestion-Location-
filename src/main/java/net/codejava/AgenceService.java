package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AgenceService {

	@Autowired
	private AgenceRepository repo;
	
	public List<Agence> listAll() {
		return repo.findAll();
	}
	
	public void save(Agence agence) {
		repo.save(agence);
	}
	
	public Agence get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	}