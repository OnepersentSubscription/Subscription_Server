package com.onepercent.subscribe.service;

import com.onepercent.subscribe.dto.StoreDTO;
import com.onepercent.subscribe.entity.CategoryCode;
import com.onepercent.subscribe.entity.Store;
import com.onepercent.subscribe.entity.StoreCategory;
import com.onepercent.subscribe.entity.Subscription;
import com.onepercent.subscribe.repository.StoreCategoryRepository;
import com.onepercent.subscribe.repository.StoreRepository;
import com.onepercent.subscribe.repository.SubscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;
    private final StoreCategoryRepository storeCategoryRepository;
    private final SubscriptionRepository subscriptionRepository;

    public List<StoreDTO> getStore() {
        System.out.println(storeRepository.findAll().get(0).getId());
        List<StoreDTO> storeDTO = storeRepository.findAll()
                .stream()
                .map(StoreDTO::new)
                .collect(Collectors.toList());
        return storeDTO;
    }

    public void enrollStore() {
        Store store  = Store.builder().name("김밥천국").build();
        CategoryCode categoryCode = CategoryCode.builder().name("한식").build();
        Subscription subscription = Subscription.builder().content("김밥 한줄 공짜").price(500).build();
        store.setSubscriptions(Set.of(subscription));
        StoreCategory storeCategory = new StoreCategory();
        storeCategory.setStore(store);
        storeCategory.setCategoryCode(categoryCode);
        storeCategoryRepository.save(storeCategory);
    }
}
