package net.codejava;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private ProductService productService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private AssuranceService assuranceService;
	@Autowired
	private CredentialsService credentialsService;
	@Autowired
	private AgenceService agenceService;
	@Autowired
	private EmployeService employeService;
	
	//////////////////////////////////////////////////////////////////System

	// crud produit
	
	@RequestMapping("/allProducts")
	public String getAllProducts(Model model) {
		List<Product> listProducts = productService.listAll();
		model.addAttribute("listProducts", listProducts);
	     System.out.print("listProducts");
	     System.out.print(listProducts);

		return "products";
	}

	@RequestMapping("/")
	public String header(Model model) {

		return "header";
	}

	@RequestMapping("/newProduct")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);

		return "new_product";
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);

		return "redirect:/products";
	}

	@RequestMapping("/editProduct/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mav.addObject("product", product);

		return mav;
	}

	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		productService.delete(id);
		return "redirect:/products";
	}
 
	
	// crud client

	@RequestMapping("/allClients")
	public String getAllClients(Model model) {
		List<Client> listClients = clientService.listAll();
		model.addAttribute("clients", listClients);
	     System.out.print("listProducts");
	     System.out.print(listClients);
		return "clients";
	}
	

	@RequestMapping("/newClient")
	public String newClient(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "new_client";
	}
	
	@RequestMapping(value = "/saveClient", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.save(client);

		return "redirect:/allClients";
	}
	
	@RequestMapping("/editClient/{id}")
	public ModelAndView editCliente(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_client"); 
		Client client = clientService.get(id);
		mav.addObject("client", client);
		return mav;
	}
	
	@RequestMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable(name = "id") Long id) {
		clientService.delete(id);
		return "redirect:/allClients";
	}

	//CRUD Assurance
	
	@RequestMapping("/allAssurances")
	public String getAllAssurances(Model model) {
		List<Assurance> listAssurances = assuranceService.listAll();
		model.addAttribute("assurances", listAssurances);
	 
	    
		return "assurances";
	}

	@RequestMapping("/newAssurance")
	public String newAssurance(Model model) {
		Assurance assurance = new Assurance();
		model.addAttribute("assurance", assurance);
	    //System.out.print(assurance.getDateDebut());
		return "new_assurance";
	}
	

	@RequestMapping(value = "/saveAssurance", method = RequestMethod.POST)
	public String saveAssurance(@ModelAttribute("assurance") Assurance assurance) {
		//assurance.setDateDebut(Calendar.getInstance().getTime());
	    System.out.print(assurance.getDateDebut());

		assuranceService.save(assurance);

	return "redirect:/allAssurances";
	}
	
	@RequestMapping("/editAssurance/{id}")
	public ModelAndView editAssurance(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_assurance"); 
		Assurance assurance = assuranceService.get(id);
		mav.addObject("assurance", assurance);
		return mav;
	}
	
	@RequestMapping("/deleteAssurance/{id}")
	public String deleteAssurance(@PathVariable(name = "id") Long id) {
		assuranceService.delete(id);
		return "redirect:/allAssurances";
	}
	
 ////////////////////////////////////////////////CRUD CREDENTIALS
	
	@RequestMapping("/allCredentials")
	public String getAllCredentials(Model model) {
		List<Credentials> listCredentials = credentialsService.listAll();
		model.addAttribute("Credentials", listCredentials);
	 
	    
		return "credentials";
	}

	@RequestMapping("/newCredential")
	public String newCredential(Model model) {
		Credentials credential = new Credentials();
		model.addAttribute("Credentials", credential);
	    //System.out.print(assurance.getDateDebut());
		return "new_credentials";
	}
	

	@RequestMapping(value = "/saveCredential", method = RequestMethod.POST)
	public String saveCredential(@ModelAttribute("Credentials") Credentials credentials) {
		//assurance.setDateDebut(Calendar.getInstance().getTime());
	   // System.out.print(credentials.getDateDebut());
	    credentialsService.save(credentials);

	return "redirect:/allCredentials";
	}
	
	@RequestMapping("/editCredential/{id}")
	public ModelAndView editCredential(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_credentials"); 
		Credentials credentials = credentialsService.get(id);
		mav.addObject("assurance", credentials);
		return mav;
	}
	
	@RequestMapping("/deleteCredential/{id}")
	public String deleteCredential(@PathVariable(name = "id") Long id) {
		credentialsService.delete(id);
		return "redirect:/allCredentials";
	}
	
	///////////CRUD Agence
	
	@RequestMapping("/allAgences")
	public String getAllAgences(Model model) {
		List<Agence> listAgences = agenceService.listAll();
		model.addAttribute("agences", listAgences);
	 	    
		return "agences";
	}

	@RequestMapping("/newAgence")
	public String newAgence(Model model) {
		Agence agence = new Agence();
		model.addAttribute("agence", agence);
	    //System.out.print(assurance.getDateDebut());
		return "new_agence";
	}
	

	@RequestMapping(value = "/saveAgence", method = RequestMethod.POST)
	public String saveAgence(@ModelAttribute("agence") Agence agence) {
		//assurance.setDateDebut(Calendar.getInstance().getTime());
		agenceService.save(agence);

	return "redirect:/allAgences";
	}
	
	@RequestMapping("/editAgence/{id}")
	public ModelAndView editAgence(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_agence"); 
		Agence agence = agenceService.get(id);
		mav.addObject("agence", agence);
		return mav;
	}
	
	@RequestMapping("/deleteAgence/{id}")
	public String deleteAgence(@PathVariable(name = "id") Long id) {
		agenceService.delete(id);
		return "redirect:/allAgences";
	}
////////////////////////////////CRUD EMPLOYE
	
	@RequestMapping("/allEmployes")
	public String getAllEmployes(Model model) {
		List<Employe> listEmployes = employeService.listAll();
		model.addAttribute("employes", listEmployes);
	 
	    
		return "employes";
	}

	@RequestMapping("/newEmploye")
	public String newEmploye(Model model) {
		Employe employe = new Employe();
		model.addAttribute("employe", employe);
	    //System.out.print(assurance.getDateDebut());
		return "new_employe";
	}
	

	@RequestMapping(value = "/saveEmploye", method = RequestMethod.POST)
	public String saveEmploye(@ModelAttribute("employe") Employe employe) {
		//assurance.setDateDebut(Calendar.getInstance().getTime());
	   

		employeService.save(employe);

	return "redirect:/allEmployes";
	}
	
	@RequestMapping("/editEmploye/{id}")
	public ModelAndView editEmploye(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_Employe"); 
		Employe employe = employeService.get(id);
		mav.addObject("employe", employe);
		return mav;
	}
	
	@RequestMapping("/deleteEmploye/{id}")
	public String deleteEmploye(@PathVariable(name = "id") Long id) {
		employeService.delete(id);
		return "redirect:/allEmployes";
	}
}
