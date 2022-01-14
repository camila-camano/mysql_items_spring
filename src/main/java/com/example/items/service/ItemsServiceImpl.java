package com.example.items.service;


import com.example.items.model.Items;
import com.example.items.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository repository;

    @Override
    public Items createItem(Items items){
        return repository.save(items);
    }

    @Override
    public Items getItemById(Long id){
        return repository.findById(id).get();
    }

    @Override
    public Items updateItemById(Items item, Long id){
        item.setId(id);
        return repository.save(item);
    }

    @Override
    public void delete(Items item, Long id){
        item.setId(id);
        repository.delete(item);
    }

}
