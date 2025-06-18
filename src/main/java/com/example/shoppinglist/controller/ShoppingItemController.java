package com.example.shoppinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppinglist.model.ShoppingItem;
import com.example.shoppinglist.service.ShoppingItemService;

@RestController
@RequestMapping("/api/shoppinglist")
public class ShoppingItemController {
      @Autowired
      private ShoppingItemService service;

      @GetMapping
      public List<ShoppingItem> getAllItems() {
            return service.getAllItems();
      }

      @PostMapping
      public ShoppingItem addItem(@RequestBody ShoppingItem item) {
            return service.saveItem(item);
      }
}