package com.onepercent.subscribe.entity;

import lombok.Setter;

import javax.persistence.*;

@Entity
public class StoreCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "store_id")
    private Store store;

    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryCode_id")
    private CategoryCode categoryCode;
}
