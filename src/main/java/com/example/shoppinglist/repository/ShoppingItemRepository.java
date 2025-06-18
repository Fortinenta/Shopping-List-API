package com.example.shoppinglist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppinglist.model.ShoppingItem;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {
}