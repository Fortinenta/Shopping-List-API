package com.example.shoppinglist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShoppingItem {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String itemName;
      private int quantity;

      // Default constructor
      public ShoppingItem() {
      }

      // Getters and Setters
      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getItemName() {
            return itemName;
      }

      public void setItemName(String itemName) {
            this.itemName = itemName;
      }

      public int getQuantity() {
            return quantity;
      }

      public void setQuantity(int quantity) {
            this.quantity = quantity;
      }
}