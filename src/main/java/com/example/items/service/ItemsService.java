package com.example.items.service;

import com.example.items.model.Items;

public interface ItemsService {
    Items createItem(Items items);
    Items getItemById(Long id);
    Items updateItemById(Items item, Long id);
    void delete(Items item, Long id);

}
