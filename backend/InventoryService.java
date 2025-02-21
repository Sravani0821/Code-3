package com.inventorymanagement.service;

import com.inventorymanagement.model.Item;
import com.inventorymanagement.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Item> getAllItems() {
        return inventoryRepository.findAll();
    }

    public Item addItem(Item item) {
        return inventoryRepository.save(item);
    }

    public Item updateItem(Long id, Item item) {
        if (inventoryRepository.existsById(id)) {
            item.setId(id);
            return inventoryRepository.save(item);
        }
        return null;
    }

    public void deleteItem(Long id) {
        inventoryRepository.deleteById(id);
    }
}
