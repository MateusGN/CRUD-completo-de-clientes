package com.devsuperior.trabalhofinalcap1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabalhofinalcap1.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
