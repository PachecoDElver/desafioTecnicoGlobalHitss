package com.globalhits.desafiotecnico.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.globalhits.desafiotecnico.model.entity.Producto;
import com.globalhits.desafiotecnico.model.repository.ProductoRepo;
import com.globalhits.desafiotecnico.model.service.ProductoService;
import com.globalhits.desafiotecnico.model.vo.productoAddInVO;
import com.globalhits.desafiotecnico.model.vo.productoAddOutVO;

@Service
public class productoImpl implements ProductoService {

	@Autowired
	ProductoRepo productosRepo;
	
	@Override
	public productoAddOutVO agregar(productoAddInVO bodyIn) {
		productosRepo.spAddProductos(bodyIn.getNombre());
		productoAddOutVO bodyOut = new productoAddOutVO();
		bodyOut.setCodeStatus(HttpStatus.OK.value());
		return bodyOut;
	}

	@Override
	public List<Producto> listar() {
		return productosRepo.spListProductos();
	}

}
