package com.onepercent.subscribe.repository;

import com.onepercent.subscribe.entity.Store;
import com.onepercent.subscribe.entity.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreCategoryRepository extends JpaRepository<StoreCategory, Long> {
}
