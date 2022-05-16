package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Articulos;
import com.crud.h2.dto.Fabricantes;

public interface IArticulosService {
	public List<Articulos> listarArticulos();
	
	public Articulos guardarArticulos(Articulos articulos);
	
	public Articulos articulosXID(Long id);
	
	public Articulos actualizarArticulos(Articulos articulos);
	
	public void eliminarArticulos(Long id);
}
