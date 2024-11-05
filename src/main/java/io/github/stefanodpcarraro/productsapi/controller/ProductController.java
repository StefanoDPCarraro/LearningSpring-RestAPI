package io.github.stefanodpcarraro.productsapi.controller;

import io.github.stefanodpcarraro.productsapi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @PostMapping
    public void createProduct(Product product) {
        System.out.println("Recieved! " + product);
    }
}
