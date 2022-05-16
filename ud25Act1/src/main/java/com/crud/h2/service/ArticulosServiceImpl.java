package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService{
	
	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos(){
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulos) {
		
		return iArticulosDAO.save(articulos);
	}

	@Override
	public Articulos articulosXID(Long id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulos(Articulos articulos) {
		
		return iArticulosDAO.save(articulos);
	}

	@Override
	public void eliminarArticulos(Long id) {
		iArticulosDAO.deleteById(id);
		
	}
}
