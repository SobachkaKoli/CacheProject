package com.example.infinispantask;

import lombok.Getter;

@Getter
public class CacheDto {
    private String key;
    private Object value;
    private Integer expiration;
}
