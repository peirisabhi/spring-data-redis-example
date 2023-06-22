package com.abhipeiris.springdataredisexample.controller;

import com.abhipeiris.springdataredisexample.entity.Product;
import com.abhipeiris.springdataredisexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 22/06/2023
 * Time: 14:11
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return productRepository.findProductById(id);
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
        return productRepository.deleteProduct(id);
    }


}
