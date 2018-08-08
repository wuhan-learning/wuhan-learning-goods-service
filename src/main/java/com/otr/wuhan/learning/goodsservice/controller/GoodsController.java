package com.otr.wuhan.learning.goodsservice.controller;

import com.otr.wuhan.learning.goodsservice.entity.Good;
import com.otr.wuhan.learning.goodsservice.service.GoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/goods")
@Slf4j
public class GoodsController {

    @Autowired
    private GoodService goodService;

    @GetMapping
    public List<Good> findAllGood() {
        log.info("called");
        return goodService.findAllGood();
    }

}
