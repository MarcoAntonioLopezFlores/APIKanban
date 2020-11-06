package mx.edu.utez.apikanban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.apikanban.entity.ProductBacklogEntity;
import mx.edu.utez.apikanban.service.ProductBacklogService;


@RestController
@RequestMapping("/APIKanban/product")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
public class ProductBacklogController {
	@Autowired
	private ProductBacklogService productBacklogService;
	
	@GetMapping("/lista")
	public List<ProductBacklogEntity> getAllProductBacklog(){
		return productBacklogService.getAllProductBacklog();
	}
	
	
	@PostMapping("/registrar")
	public ProductBacklogEntity saveProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		
		return productBacklogService.saveProductBacklog(productBacklog);
	}
	
	@PutMapping("/actualizar")
	public ProductBacklogEntity updateProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		return productBacklogService.saveProductBacklog(productBacklog);
	}
}
