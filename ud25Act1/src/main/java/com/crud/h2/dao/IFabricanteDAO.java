package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Fabricantes;

public interface IFabricanteDAO extends JpaRepository<Fabricantes, Long>{

}
