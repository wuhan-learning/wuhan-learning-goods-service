package com.otr.wuhan.learning.goodsservice.Repository;


import com.otr.wuhan.learning.goodsservice.entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<Good, Long> {
}
