package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products/list";
    }
    
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "products/form";
    }
    
    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product) {
        productService.createProduct(product);
        return "redirect:/products";
    }
    
    @GetMapping("/{id}")
    public String viewProduct(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "products/view";
    }
    
    @GetMapping("/search")
    public String searchProducts(@RequestParam String query, Model model) {
        model.addAttribute("products", productService.searchProducts(query));
        model.addAttribute("searchQuery", query);
        return "products/list";
    }
    
    @GetMapping("/category/{category}")
    public String listByCategory(@PathVariable String category, Model model) {
        model.addAttribute("products", productService.getProductsByCategory(category));
        model.addAttribute("currentCategory", category);
        return "products/list";
    }
}
