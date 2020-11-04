package com.example.demo.controller;

import com.example.demo.dto.Goods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * TODO
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    public static final Logger log = LoggerFactory.getLogger(GoodsController.class);

    @PutMapping
    public Goods put(@RequestBody Goods goods) {
        log.info("put：{}", goods);
        return goods;
    }

    @DeleteMapping
    public Goods delete(@RequestBody Goods goods) {
        log.info("delete：{}", goods);
        return goods;
    }

    @GetMapping
    public Goods get(@RequestParam int num) {
        log.info("get：{}", num);
        return new Goods(new BigDecimal("1.2"), "哈密瓜", num);
    }

    @PostMapping
    public Goods post(@RequestBody Goods goods) {
        log.info("post：{}", goods);
        return goods;
    }
}
