package com.globalhits.desafiotecnico.model.service;

import java.util.List;

import com.globalhits.desafiotecnico.model.entity.Producto;
import com.globalhits.desafiotecnico.model.vo.productoAddInVO;
import com.globalhits.desafiotecnico.model.vo.productoAddOutVO;

public interface ProductoService {
	productoAddOutVO agregar(productoAddInVO producto);
	List<Producto> listar();
}
