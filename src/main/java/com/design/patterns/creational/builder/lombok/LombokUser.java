package com.design.patterns.creational.builder.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class LombokUser {

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;
    private int age;

}
