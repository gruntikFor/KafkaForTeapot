package com.example.kafkaforteapot.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CatDto {
    String name;
    Integer age;
    String owner;

}
