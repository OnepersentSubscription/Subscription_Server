package com.onepercent.subscribe.repository;

import com.onepercent.subscribe.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
