package com.example.inventory.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping("/{sku}")
    public Map<String, Object> stockFor(@PathVariable String sku) {
        return Map.of("sku", sku, "available", 42);
    }

    @PostMapping("/{sku}/reserve")
    public Map<String, Object> reserve(@PathVariable String sku, @RequestParam int qty) {
        return Map.of("sku", sku, "reserved", qty);
    }
}
