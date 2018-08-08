package com.otr.wuhan.learning.goodsservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Good {

    @JsonProperty
    private long id;

    @JsonProperty
    private String name;
}
