package com.pandit.kiraniBackend.controller;

import com.pandit.kiraniBackend.model.ItemEntity;
import com.pandit.kiraniBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/items")
    public List<ItemEntity> getAllItems() {
        return userService.getAllItems();
    }

    @GetMapping("/items/{itemCatg}")
    public List<ItemEntity> getAllItemsByCatg(@PathVariable Integer itemCatg) {
        return userService.getItemByCatg(itemCatg);
    }
}
