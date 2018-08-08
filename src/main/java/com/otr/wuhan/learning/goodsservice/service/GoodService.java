package com.otr.wuhan.learning.goodsservice.service;

import com.otr.wuhan.learning.goodsservice.entity.Good;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GoodService {

    public List<Good> findAllGood() {
        return Arrays.asList(
                new Good(1, "123"),
                new Good(2, "456"),
                new Good(3, "789")
        );
    }
}
