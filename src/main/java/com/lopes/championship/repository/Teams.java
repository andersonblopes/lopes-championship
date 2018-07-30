package com.lopes.championship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopes.championship.model.Team;

public interface Teams extends JpaRepository<Team, Long> {

}
