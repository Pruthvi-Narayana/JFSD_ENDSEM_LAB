package com.jfsd.exam.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jfsd.exam.demo.model.Product;

@Service
public class ProductService {
    private final RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Product> getAllProducts() {
        String url = "https://fakestoreapi.com/products";
        Product[] products = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(products);
    }
}
