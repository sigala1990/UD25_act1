package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Fabricantes;

public interface IFabricanteService {
 
	public List<Fabricantes> listarFabricantes();
	
	public Fabricantes guardarFabricantes(Fabricantes fabricantes);
	
	public Fabricantes fabricantesXID(Long id);
	
	public Fabricantes actualizarFabricantes(Fabricantes fabricantes);
	
	public void eliminarFabricantes(Long id);

}
