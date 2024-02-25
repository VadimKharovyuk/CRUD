package com.example.crud.controller;

import com.example.crud.model.Product;
import com.example.crud.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Component
@AllArgsConstructor
public class ProductController {
    private final ProductRepository productRepository ;
    @GetMapping("/")
    public String  showProductList(Model model){
        model.addAttribute("products",productRepository.findAll());
         return "products";
    }
}
