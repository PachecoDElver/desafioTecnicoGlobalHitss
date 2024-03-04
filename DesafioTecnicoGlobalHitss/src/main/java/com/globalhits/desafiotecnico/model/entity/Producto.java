package com.globalhits.desafiotecnico.model.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_producto")
public class Producto implements Serializable{
	
	private static final long serialVersionUID = 8551400080605537319L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Long idProducto;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	public Long getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
