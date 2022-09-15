package controller.repository;

import com.backend.ProductsAPI.repository.entity.Product;
import com.springframework.data.repository.CrudRepository;

public interface ProductRepository
    extends CrudRepository<Product, Integer>
{
    
}