package com.onepercent.subscribe.controller;

import com.onepercent.subscribe.dto.StoreDTO;
import com.onepercent.subscribe.entity.Store;
import com.onepercent.subscribe.repository.StoreRepository;
import com.onepercent.subscribe.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeService;
    private final StoreRepository storeRepository;

    @GetMapping("/storelist")
    public List<Store> getStore() {
        List<Store> list = storeRepository.findAll();
        return list;
//        List<StoreDTO> storeDTOS = storeService.getStore();
//        return storeDTOS;
    }

    @GetMapping("enroll")
    public String enrollStore() {
        storeService.enrollStore();
        return "beef";
    }
}
