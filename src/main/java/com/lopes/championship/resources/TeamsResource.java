package com.lopes.championship.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopes.championship.model.Team;
import com.lopes.championship.repository.Teams;

@RestController
@RequestMapping("/teams")
public class TeamsResource {

	@Autowired
	private Teams teams;

	@GetMapping
	public List<Team> listar() {
		return this.teams.findAll();
	}

	@PostMapping
	public Team inserir(@Valid @RequestBody Team team) {
		return teams.save(team);
	}

}
