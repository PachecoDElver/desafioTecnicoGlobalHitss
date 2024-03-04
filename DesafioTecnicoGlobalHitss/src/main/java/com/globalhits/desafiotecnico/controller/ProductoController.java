package com.globalhits.desafiotecnico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalhits.desafiotecnico.model.entity.Producto;
import com.globalhits.desafiotecnico.model.service.ProductoService;
import com.globalhits.desafiotecnico.model.vo.productoAddInVO;
import com.globalhits.desafiotecnico.model.vo.productoAddOutVO;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoServ;
	
	@PostMapping("/registrar")
	@Transactional(rollbackFor = Exception.class)
	public productoAddOutVO registrarProdcuto(@RequestBody productoAddInVO body) {
		return productoServ.agregar(body);
	}
	
	@GetMapping("/listar")
	public List<Producto> listarProducto() {
		return productoServ.listar();
	}
}
