package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulos")
public class Articulos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private Fabricantes fabricante_id;

	
	
	public Articulos() {
		super();
	}

	public Articulos(Long codigo, String nombre, int precio, Fabricantes fabricante_id) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante_id = fabricante_id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return fabricante_id;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante_id = fabricante;
	}
	
	
	
}
