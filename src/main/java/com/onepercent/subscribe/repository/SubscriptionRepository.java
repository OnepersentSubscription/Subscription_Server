package com.onepercent.subscribe.repository;

import com.onepercent.subscribe.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
