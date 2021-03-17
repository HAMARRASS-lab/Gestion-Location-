package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientRepository repo;
	
	public List<Client> listAll() {
		return repo.findAll();
	}
	
	public void save(Client client) {
		repo.save(client);
	}
	
	public Client get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	}