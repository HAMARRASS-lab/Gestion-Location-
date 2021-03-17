package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeService {

	@Autowired
	private EmployeRepository repo;
	
	public List<Employe> listAll() {
		return repo.findAll();
	}
	
	public void save(Employe employe) {
		repo.save(employe);
	}
	
	public Employe get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	}