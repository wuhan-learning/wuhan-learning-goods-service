package com.otr.wuhan.learning.goodsservice.controller;

import com.otr.wuhan.learning.goodsservice.entity.Goods;
import com.otr.wuhan.learning.goodsservice.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/goods")
@Slf4j
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/{id}")
    public Goods findGoodsById(@PathVariable("id") String id) {
        return goodsService.findGoodsById(id);
    }

    @GetMapping
    public List<Goods> findAllGoods(@RequestParam(value = "action", required = false) String action) throws InterruptedException {
        return goodsService.findAllGoods(action);
    }

}
