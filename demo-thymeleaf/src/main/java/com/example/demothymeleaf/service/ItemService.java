package com.example.demothymeleaf.service;

import com.example.demothymeleaf.entity.Item;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    public List<Item> findAll() {
        return Arrays.asList(
                new Item("Lungo"),
                new Item("Espresso"),
                new Item("Piccolo neexistuje")
        );
    }

}
