package com.example.calcrud.service;

import com.example.calcrud.domain.Item;
import com.example.calcrud.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemApplicationService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemApplicationService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    public List<Item> getItem(){
        return itemRepository.findAll();

    }

    public Item updateItem(Item item){
        return itemRepository.save(item);
    }

    public void deleteItem(Long id){
        itemRepository.deleteItemById(id);
    }






}
