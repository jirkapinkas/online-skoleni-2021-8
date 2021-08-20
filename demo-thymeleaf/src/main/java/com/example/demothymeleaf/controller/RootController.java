package com.example.demothymeleaf.controller;

import com.example.demothymeleaf.entity.Item;
import com.example.demothymeleaf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RootController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String root(Model model) {
        List<Item> items = itemService.findAll();
        model.addAttribute("items", items);
        model.addAttribute("itemsSize", items.size());
        return "root.html";
    }

}
