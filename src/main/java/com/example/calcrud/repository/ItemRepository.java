package com.example.calcrud.repository;

import com.example.calcrud.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository <Item, Long> {
    void deleteItemById(Long Id);

}
