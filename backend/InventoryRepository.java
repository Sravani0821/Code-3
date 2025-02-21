package com.inventorymanagement.repository;

import com.inventorymanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Item, Long> {
}
