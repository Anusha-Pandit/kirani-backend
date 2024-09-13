package com.pandit.kiraniBackend.service;

import com.pandit.kiraniBackend.model.CatgEntity;
import com.pandit.kiraniBackend.model.ItemEntity;
import com.pandit.kiraniBackend.repositories.CatgRepository;
import com.pandit.kiraniBackend.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    CatgRepository catgRepository;

    @Autowired
    ItemRepository itemRepository;

    public List<CatgEntity> getAllCatg(){
        return catgRepository.findAll();
    }

    public void addItem(ItemEntity itemEntity) {

        itemRepository.save(itemEntity);
    }

}

