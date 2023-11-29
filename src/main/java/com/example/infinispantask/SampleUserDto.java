package com.example.infinispantask;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class SampleUserDto implements Serializable {
    private long id;
    private String name;
    private String email;
    private SampleCarDto car;
}
