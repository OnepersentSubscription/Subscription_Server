package com.onepercent.subscribe.dto;

import com.onepercent.subscribe.entity.Store;
import com.onepercent.subscribe.entity.StoreCategory;
import com.onepercent.subscribe.entity.Subscription;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;


public class StoreDTO {
    private Long id;
    private String name;
    private Set<StoreCategory> categories = new HashSet<>();
    private Set<Subscription> subscriptions = new HashSet<>();

    public StoreDTO(Store store) {
        this.id = store.getId();
        this.name = store.getName();
        this.categories.addAll(store.getCategories());
        this.subscriptions.addAll(store.getSubscriptions());
    }
}
