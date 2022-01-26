package com.example.items.controller;

import com.example.items.model.Items;
import com.example.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemsService service;

    @GetMapping("/example")
    public String getMensajesString() {
        return "Ejemplo de respuesta 8082";
    }

    @GetMapping("/{id}")
    public Items getItem(@PathVariable Long id){
        return service.getItemById(id);
    }

    @PostMapping("/post")
    public Items createItem(@RequestBody Items item){
        return service.createItem(item);
    }

    @PutMapping("/{id}")
    public Items updateItemById(@PathVariable Long id, @RequestBody Items item){
        return service.updateItemById(item, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        Items item = service.getItemById(id);
        service.delete(item,id);
    }

}
