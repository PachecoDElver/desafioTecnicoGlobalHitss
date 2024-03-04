package com.globalhits.desafiotecnico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.globalhits.desafiotecnico.model.entity.Producto;

public interface ProductoRepo extends JpaRepository<Producto, Long>{
	@Modifying
	@Query(value = "CALL sp_add_productos(:nombre);", nativeQuery = true)
    void spAddProductos(@Param("nombre") String nombre);
	
	@Query(value = "CALL sp_listar_productos();", nativeQuery = true)
    List<Producto> spListProductos();
}
