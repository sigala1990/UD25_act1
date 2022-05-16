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

import com.crud.h2.dto.Articulos;
import com.crud.h2.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulos(@RequestBody Articulos articulos) {
		return articulosServiceImpl.guardarArticulos(articulos);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulos articulosXID(@PathVariable(name="codigo") Long id) {
		
		Articulos articulos_xid = new Articulos();
		articulos_xid= articulosServiceImpl.articulosXID(id);
		
		System.out.println("Articulos XID: "+articulos_xid);
		
		return articulos_xid;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulos actualizarVideo(@PathVariable(name="codigo")Long id,@RequestBody Articulos articulos) {
		Articulos articulos_seleccionado = new Articulos();
		Articulos articulos_actualizado = new Articulos();
		
		articulos_seleccionado = articulosServiceImpl.articulosXID(id);
		
		articulos_seleccionado.setFabricante(articulos.getFabricante());
		articulos_seleccionado.setNombre(articulos.getNombre());
		articulos_seleccionado.setPrecio(articulos.getPrecio());

		articulos_actualizado = articulosServiceImpl.actualizarArticulos(articulos_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulos_actualizado);
		
		return articulos_actualizado;
	}
	
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArtiuclos(@PathVariable(name="codigo")Long id) {
		articulosServiceImpl.eliminarArticulos(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
