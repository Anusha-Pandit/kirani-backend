package com.pandit.kiraniBackend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "item_catg")
public class CatgEntity {


    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cart_name")
    private String cartName;

    @Column(name = "desc")
    private String desc;
}
