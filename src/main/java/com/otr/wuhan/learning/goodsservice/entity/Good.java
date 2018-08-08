package com.otr.wuhan.learning.goodsservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="mst_good")
@Setter
@Getter
public class Good {

    @Id
    @JsonProperty
    @GeneratedValue
    private long id;

    @JsonProperty
    @Column(name = "name")
    private String name;
}
