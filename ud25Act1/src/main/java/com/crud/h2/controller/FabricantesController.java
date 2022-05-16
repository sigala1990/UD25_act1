package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Fabricantes;
import com.crud.h2.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricantes(@RequestBody Fabricantes fabricantes) {
		return fabricantesServiceImpl.guardarFabricantes(fabricantes);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricantes fabricantesXID(@PathVariable(name="codigo") Long id) {

		Fabricantes fabricante_xid = new Fabricantes();
		fabricante_xid = fabricantesServiceImpl.fabricantesXID(id);
		
		System.out.println("Fabricantes XID: "+ fabricante_xid );
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="codigo")Long id,@RequestBody Fabricantes fabricantes) {
		
		Fabricantes fabricantes_seleccionado = new Fabricantes();
		Fabricantes fabricantes_actualizado = new Fabricantes();
		
		fabricantes_seleccionado = fabricantesServiceImpl.fabricantesXID(id);
		
		fabricantes_seleccionado.setArticulos(fabricantes.getArticulos());
		fabricantes_seleccionado.setCodigo(fabricantes.getCodigo());
		fabricantes_seleccionado.setNombre(fabricantes.getNombre());
		
		fabricantes_seleccionado = fabricantesServiceImpl.actualizarFabricantes(fabricantes_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricantes_actualizado);
		
		return fabricantes_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricantes(@PathVariable(name="codigo")Long id) {
		fabricantesServiceImpl.eliminarFabricantes(id);
	}
}
