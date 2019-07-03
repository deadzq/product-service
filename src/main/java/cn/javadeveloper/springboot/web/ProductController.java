package cn.javadeveloper.springboot.web;
import java.util.List;

import cn.javadeveloper.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.javadeveloper.springboot.pojo.Product;

@Controller
public class ProductController {
 
	@Autowired
    ProductService productService;

	@GetMapping("/")
	public Object index(){
	    return "index";
    }
	
    @GetMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
    	m.addAttribute("ps", ps);
        return "products";
    }
}