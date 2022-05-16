package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Long>{

}
