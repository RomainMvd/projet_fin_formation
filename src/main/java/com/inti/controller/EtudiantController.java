//package com.inti.controller;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.inti.entities.Cours;
//import com.inti.entities.Enseignant;
//import com.inti.entities.Etudiant;
//import com.inti.entities.Personne;
//import com.inti.entities.Role;
//import com.inti.service.interfaces.IEtudiantService;
//import com.inti.service.interfaces.IPersonneService;
//
//@RestController
//@CrossOrigin
//public class EtudiantController {
//
//	@Autowired
//	IEtudiantService etudiantService;
//	/*
//	@Autowired
//	IPersonneService personneService;
//	*/
//	@Autowired
//	PasswordEncoder passwordEncoder;
//	
//	// GET
//	
//	@GetMapping("/etudiants")
//	public List<Etudiant> findAll() {
//		return etudiantService.findAll();
//	}
//	
//	@GetMapping("/etudiants/{idE}")
//	public Etudiant findOne(@PathVariable("idE") Long idEtudiant) {
//		return etudiantService.findOne(idEtudiant);
//	}
//	
//	@GetMapping("/etudiants/{username}")
//	public Etudiant findOneByUsername(@PathVariable("username") String username) {
//		return etudiantService.findByUsername(username);
//	}
//	
//	@GetMapping("/etudiants/{email}")
//	public Etudiant findByEmail(@PathVariable("email") String email) {
//		return etudiantService.findByEmail(email);
//	}
//	
//	@GetMapping("/etudiants/{moyenne}")
//	public List<Etudiant> findByMoyenne(@PathVariable("moyenne") Double moyenne) {
//		return etudiantService.findByMoyenne(moyenne);
//	}
//	
//	@GetMapping("/etudiants/{enabled}")
//	public List<Etudiant> findByEnabled(@PathVariable("enabled") boolean enabled) {
//		return etudiantService.findByEnabled(enabled);
//	}
//	
//	// DELETE
//	
//	@DeleteMapping("/etudiants/{idE}")
//	public void deleteEtudiant(@PathVariable("idE") Long idEtudiant) {
//		etudiantService.delete(idEtudiant);
//	}
//	
//	// POST
//	
//	// Méthode 1 POST
//	
//	@PostMapping("/etudiants")
//	public String saveEtudiant(@RequestParam(name = "nomEtudiant", required = false) String nomEtudiant, 
//			@RequestParam(name="prenomEtudiant", required = false) String prenomEtudiant, 
//			@RequestParam(name="dateNaissance", required = false) Date dateNaissance, 
//			@RequestParam(name="username", required = false) String username, 
//			@RequestParam(name="password", required = false) String password,
//			@RequestParam(name="email", required = false) String email, 
//			@RequestParam(name = "enabled", required = false) boolean enabled,
//			@RequestParam(name = "photoProfil", required = false) MultipartFile photoProfil,
//			@RequestParam(name = "roles", required = false) Set<Role> roles,
//			@RequestParam(name= "courss", required = false) Set<Cours> courss, 
//			@RequestParam(name = "moyenne", required = false) Double moyenne) {
//		System.out.println(username);
//		System.out.println(password);
//		try {
//			Etudiant currentEtudiant = new Etudiant();
//			currentEtudiant.setNomPersonne(nomEtudiant);
//			currentEtudiant.setPrenomPersonne(prenomEtudiant);
//			currentEtudiant.setDateNaissancePersonne(dateNaissance);
//			currentEtudiant.setUsername(username);
//			System.out.println(password);
//			currentEtudiant.setPassword(passwordEncoder.encode(password));
//			currentEtudiant.setEmail(email);
//			currentEtudiant.setEnabled(enabled);
//			if (photoProfil != null) {
//				currentEtudiant.setPhotoProfil(photoProfil.getBytes());
//			}
//			currentEtudiant.setRoles(roles);
//			currentEtudiant.setCourss(courss);
//			currentEtudiant.setMoyenne(moyenne);
//			etudiantService.save(currentEtudiant);
//			return "Etudiant uploaded";
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			return "Failed";
//		}
//	}
//	
//	// Méthode 2
//	/*
//	@PostMapping("/etudiants")
//	public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
//		Etudiant currentEtudiant = new Etudiant();
//		currentEtudiant.setNomPersonne(etudiant.getNomPersonne());
//		currentEtudiant.setPrenomPersonne(etudiant.getPrenomPersonne());
//		currentEtudiant.setDateNaissancePersonne(etudiant.getDateNaissancePersonne());
//		currentEtudiant.setUsername(etudiant.getUsername());
//		currentEtudiant.setPassword(passwordEncoder.encode(etudiant.getPassword()));
//		currentEtudiant.setEmail(etudiant.getEmail());
//		currentEtudiant.setEnabled(etudiant.isEnabled());
//		currentEtudiant.setPhotoProfil(etudiant.getPhotoProfil());
//		currentEtudiant.setRoles(etudiant.getRoles());
//		currentEtudiant.setCourss(etudiant.getCourss());
//		currentEtudiant.setMoyenne(etudiant.getMoyenne());
//		return etudiantService.save(currentEtudiant);
//		
//	}
//	*/
//	
//	// PUT
//	
//	@PutMapping("/etudiants/{idE}")
//	public Etudiant updateEtudiant(@PathVariable("idE") Long idEtudiant, @RequestBody Etudiant etudiant) {
//		Etudiant currentEtudiant = etudiantService.findOne(idEtudiant);
//		currentEtudiant.setNomPersonne(etudiant.getNomPersonne());
//		currentEtudiant.setPrenomPersonne(etudiant.getPrenomPersonne());
//		currentEtudiant.setDateNaissancePersonne(etudiant.getDateNaissancePersonne());
//		currentEtudiant.setUsername(etudiant.getUsername());
//		currentEtudiant.setPassword(etudiant.getPassword());
//		currentEtudiant.setEmail(etudiant.getEmail());
//		currentEtudiant.setEnabled(etudiant.isEnabled());
//		currentEtudiant.setPhotoProfil(etudiant.getPhotoProfil());
//		currentEtudiant.setRoles(etudiant.getRoles());
//		currentEtudiant.setCourss(etudiant.getCourss());
//		currentEtudiant.setMoyenne(etudiant.getMoyenne());
//		return etudiantService.save(currentEtudiant);
//		
//	}
//	
//}
//
//
//	/*
//	@GetMapping("/etudiants")
//	public List<Etudiant> findAll() {
//		return etudiantService.findAll();
//	}
//	
//	@GetMapping("/etudiants/{idE}")
//	public Etudiant findOne(@PathVariable("idE") Long idEtudiant) {
//		return etudiantService.findOne(idEtudiant);
//	}
//	
//	@GetMapping("/etudiants/{username}")
//	public Etudiant findOne(@PathVariable("username") String username) {
//		return etudiantService.findByUsername(username);
//	}
//	
//	@GetMapping("/etudiants/{type}")
//	public List<Personne> findByRole(@PathVariable("type") String type){
//		return personneService.findByRole(type);
//	}
//	
//	
//	
//	
//	@PostMapping("/etudiants")
//	public String saveEtudiant(@RequestParam(name = "nomEtudiant", required = false) String nomEtudiant, @RequestParam(name = "prenomEtudiant", required = false) String prenomEtudiant,
//			@RequestParam(name = "username", required = false) String username, @RequestParam(name="password", required = false) String password, @RequestParam(name = "moyenne", required = false) Double moyenne,
//			@RequestParam(name = "dateNaissanceEtudiant", required = false) Date dateNaissance, @RequestParam(name = "emailEtudiant", required = false) String emailEtudiant) {
//		
//		try {
//			Etudiant currentEtudiant = new Etudiant();
//			currentEtudiant.setNomPersonne(nomEtudiant);
//			currentEtudiant.setPrenomPersonne(prenomEtudiant);
//			currentEtudiant.setUsername(username);
//			currentEtudiant.setPassword(passwordEncoder.encode(password));
//			System.out.println(currentEtudiant.getPassword());
//			currentEtudiant.setMoyenne(moyenne);
//			currentEtudiant.setDateNaissancePersonne(dateNaissance);
//			currentEtudiant.setEmail(emailEtudiant);
//			etudiantService.save(currentEtudiant);
//			return "Etudiant uploaded";
//		}catch(Exception ex) {
//			ex.printStackTrace();
//			return "Error";
//		}
//	}
//	
//	
//	@PostMapping("/etudiants")
//	public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
//		Etudiant currentEtudiant = new Etudiant();
//		currentEtudiant.setNomPersonne(etudiant.getNomPersonne());
//		currentEtudiant.setPrenomPersonne(etudiant.getPrenomPersonne());
//		currentEtudiant.setUsername(etudiant.getUsername());
//		currentEtudiant.setPassword(passwordEncoder.encode(etudiant.getPassword()));
//		currentEtudiant.setMoyenne(etudiant.getMoyenne());
//		currentEtudiant.setDateNaissancePersonne(etudiant.getDateNaissancePersonne());
//		currentEtudiant.setEmail(etudiant.getEmail());
//		return etudiantService.save(currentEtudiant);
//	}
//	
//	@PutMapping("/etudiants/{idE}")
//	public Etudiant updateEtudiant(@PathVariable("idE") Long idEtudiant, @RequestBody Etudiant etudiant) {
//		Etudiant currentEtudiant = etudiantService.findOne(idEtudiant);
//		currentEtudiant.setNomPersonne(etudiant.getNomPersonne());
//		currentEtudiant.setPrenomPersonne(etudiant.getPrenomPersonne());
//		currentEtudiant.setUsername(etudiant.getUsername());
//		currentEtudiant.setPassword(etudiant.getPassword());
//		currentEtudiant.setMoyenne(etudiant.getMoyenne());
//		currentEtudiant.setDateNaissancePersonne(etudiant.getDateNaissancePersonne());
//		currentEtudiant.setEmail(etudiant.getEmail());
//		currentEtudiant.setCourss(etudiant.getCourss());
//		currentEtudiant.setRoles(etudiant.getRoles());
//		//currentEtudiant.setClasse(etudiant.getClasse());
//		return etudiantService.save(currentEtudiant);
//	}
//	
//	@DeleteMapping("/etudiants/{idE}")
//	public void deleteEtudiant(@PathVariable("idE") Long idEtudiant) {
//		etudiantService.delete(idEtudiant);
//	}
//	
//}
//*/