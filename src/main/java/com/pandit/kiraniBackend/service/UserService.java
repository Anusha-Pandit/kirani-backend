package com.pandit.kiraniBackend.service;

import com.pandit.kiraniBackend.model.ItemEntity;
import com.pandit.kiraniBackend.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    ItemRepository itemRepository;


    public List<ItemEntity> getAllItems(){
        return itemRepository.findAll();
    }

    public List<ItemEntity> getItemByCatg(Integer itemCatg) {
        return itemRepository.getAllByItemCatg(itemCatg);
    }
}
