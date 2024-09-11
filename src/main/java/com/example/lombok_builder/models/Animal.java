package com.example.lombok_builder.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Animal {

    // Lombok example

    private String type;
    private String name;

}
