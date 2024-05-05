package com.example.ExamenProgra.controllers;

import com.example.ExamenProgra.entities.Product;
import com.example.ExamenProgra.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> GetAll(){
        return productService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Product GetById (@PathVariable Long id){
        return productService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Product product){

        productService.create(product);
    }
    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Product product){
        productService.update(id, product);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){

        productService.delate(id);
    }
}
