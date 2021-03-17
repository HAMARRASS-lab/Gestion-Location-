package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CredentialsService {

	@Autowired
	private CredentialsRepository repo;
	
	public List<Credentials> listAll() {
		return repo.findAll();
	}
	
	public void save(Credentials credentials) {
		repo.save(credentials);
	}
	
	public Credentials get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	}