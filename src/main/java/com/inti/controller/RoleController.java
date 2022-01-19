package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@RestController
@CrossOrigin
public class RoleController {
	@Autowired
	IRoleService roleService;

	@RequestMapping(value = "roles", method = RequestMethod.GET)
	public List<Role> findAll() {
		return roleService.findAll();
	}

	@RequestMapping(value = "roles/{idR}", method = RequestMethod.GET)
	public Role findOne(@PathVariable("idR") Long idRole) {
		return roleService.findOne(idRole);
	}

	@RequestMapping(value = "roles/{idR}/{nomRole}", method = RequestMethod.GET)
	public Role findByIdAndNom(@PathVariable("idR") Long idRole, @PathVariable("nomRole") String nomRole) {
		return roleService.findByIdAndRole(idRole, nomRole);
	}

	@RequestMapping(value = "roles", method = RequestMethod.POST)
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}

	@RequestMapping(value = "roles/{idR}", method = RequestMethod.PUT)
	public Role updateRole(@PathVariable("idR") Long idRole, @RequestBody Role role) {
		Role currentRole = roleService.findOne(idRole);
		currentRole.setNomRole(role.getNomRole());
		return roleService.save(currentRole);
	}

	@RequestMapping(value = "roles/{idR}", method = RequestMethod.DELETE)
	public void deleteRole(@PathVariable("idR") Long idRole, @RequestBody Role role) {
		roleService.delete(idRole);
	}
}
