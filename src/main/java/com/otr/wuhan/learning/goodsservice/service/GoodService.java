package com.otr.wuhan.learning.goodsservice.service;

import com.otr.wuhan.learning.goodsservice.Repository.GoodRepository;
import com.otr.wuhan.learning.goodsservice.entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {

    @Autowired
    GoodRepository goodRepository;

    public List<Good> findAllGood() {
        return goodRepository.findAll();
    }
}
