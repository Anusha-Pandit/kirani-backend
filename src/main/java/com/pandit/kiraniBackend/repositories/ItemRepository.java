package com.pandit.kiraniBackend.repositories;

import com.pandit.kiraniBackend.model.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

    List<ItemEntity> getAllByItemCatg(Integer itemCatg);
}
