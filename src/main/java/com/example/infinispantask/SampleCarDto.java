package com.example.infinispantask;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class SampleCarDto implements Serializable {
    private Long id;
    private String name;
}
