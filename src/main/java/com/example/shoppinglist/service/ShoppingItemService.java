package com.example.shoppinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppinglist.model.ShoppingItem;
import com.example.shoppinglist.repository.ShoppingItemRepository;

@Service
public class ShoppingItemService {
      @Autowired
      private ShoppingItemRepository repository;

      public List<ShoppingItem> getAllItems() {
            return repository.findAll();
      }

      public ShoppingItem saveItem(ShoppingItem item) {
            return repository.save(item);
      }
}