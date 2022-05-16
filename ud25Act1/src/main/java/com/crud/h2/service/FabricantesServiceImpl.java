package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricanteDAO;
import com.crud.h2.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes(){
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricantes){
		return iFabricanteDAO.save(fabricantes);
	}
	
	@Override
	public Fabricantes fabricantesXID(Long id) {
		return iFabricanteDAO.findById(id).get();
	}
	
	@Override
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes) {
		return iFabricanteDAO.save(fabricantes);
	}
	
	@Override
	public void eliminarFabricantes(Long id) {
		iFabricanteDAO.deleteById(id);
	}
}
