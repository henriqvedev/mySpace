package com.myspace.repository;

import com.myspace.entities.ItensArmarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<ItensArmarios,Long > {

}
