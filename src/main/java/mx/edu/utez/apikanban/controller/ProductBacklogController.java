package mx.edu.utez.apikanban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class ProductBacklogController {
	@Autowired
	private ProductBacklogService productBacklogService;
	
	@GetMapping("/lista/{idProject}")
	public List<ProductBacklogEntity> getAllProductBacklog(@PathVariable("idProject") long idProject){
		return productBacklogService.getAllProductBacklog(idProject);
	}
	
	
	@PostMapping("/registrar")
	public ProductBacklogEntity saveProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		
		return productBacklogService.saveProductBacklog(productBacklog);
	}
	
	@PutMapping("/actualizar/status")
	public ProductBacklogEntity updateStatusProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		System.out.println(productBacklog.getId());
		System.out.println(productBacklog.getStatus());
		return productBacklogService.updateStatusProduct(productBacklog);
	}
	
	@PutMapping("/actualizar")
	public ProductBacklogEntity updateProductBacklog(@RequestBody ProductBacklogEntity productBacklog) {
		return productBacklogService.saveProductBacklog(productBacklog);
	}
}
