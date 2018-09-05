package com.otr.wuhan.learning.goodsservice.service;

import com.otr.wuhan.learning.goodsservice.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GoodsService {

    public Goods findGoodsById(String id) {
        return new Goods(Long.valueOf(id), "Goods-" + id);
    }

    public List<Goods> findAllGoods(String action) throws InterruptedException {
        if (!"close".equals(action)) {
            Thread.sleep(10000l);
        }
        return Arrays.asList(
                new Goods(1, "123"),
                new Goods(2, "456"),
                new Goods(3, "789")
        );
    }
}
