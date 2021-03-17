package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AssuranceService {

	@Autowired
	private AssuranceRepository repo;
	
	public List<Assurance> listAll() {
		return repo.findAll();
	}
	
	public void save(Assurance assurance) {
		repo.save(assurance);
	}
	
	public Assurance get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	}