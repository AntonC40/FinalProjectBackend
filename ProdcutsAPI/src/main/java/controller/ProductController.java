package controller;

import com.backend.ItemsAPI.repository.ProductRepository;
import com.backend.ItemsAPI.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestController
@RequestMapping()
public class ProductController {
    final ProductRepository productRepository;

    public ProductController(@Autowired ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> getItems(){
        return productRepository.findAll();
    }
}
