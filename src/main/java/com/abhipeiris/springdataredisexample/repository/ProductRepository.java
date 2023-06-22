package com.abhipeiris.springdataredisexample.repository;

import com.abhipeiris.springdataredisexample.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 22/06/2023
 * Time: 14:07
 */
@Repository
public class ProductRepository {

    public static final String HASH_KEY = "Product";


    @Autowired
    private RedisTemplate template;

    public Product save(Product product){
        template.opsForHash().put(HASH_KEY,product.getId(),product);
        return product;
    }

    public List<Product> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id){
        return (Product) template.opsForHash().get(HASH_KEY,id);
    }


    public String deleteProduct(int id){
        template.opsForHash().delete(HASH_KEY,id);
        return "product removed !!";
    }


}
