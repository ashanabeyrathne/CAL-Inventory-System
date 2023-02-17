package com.example.calcrud.controller;


import com.example.calcrud.domain.Item;
import com.example.calcrud.service.ItemApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/item")
public class ItemController {
    private final ItemApplicationService itemApplicationService;

    @Autowired
    public ItemController(ItemApplicationService itemApplicationService){
        this.itemApplicationService = itemApplicationService;
    }

    @GetMapping("/get")
    public List<Item> getItem(){
        return itemApplicationService.getItem();
    }

    @PostMapping("/add")
    public void addNewItem(@RequestBody Item item){
        itemApplicationService.addItem(item);
    }

    @PutMapping("/update")
    public ResponseEntity<Item> updateItem(@RequestBody Item item){
        Item updateItem = itemApplicationService.updateItem(item);
        return new ResponseEntity<>(updateItem, HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/{Id}")
    public void deleteItem(@PathVariable("Id")Long Id){
        itemApplicationService.deleteItem(Id);

    }

}
