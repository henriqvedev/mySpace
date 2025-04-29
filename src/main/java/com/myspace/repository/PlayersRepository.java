package com.myspace.repository;

import com.myspace.entities.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players, Long> {

}
