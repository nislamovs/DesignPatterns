package com.design.patterns.creational.singleton.Lombok;

import lombok.*;

import static lombok.Singleton.Style.HOLDER;

@Singleton(style=HOLDER)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString()
public class LombokUser {

    @Getter
    private static final LombokUser instance = new LombokUser();

    @Getter @Setter
    private String firstname;

    @Getter @Setter
    private String lastname;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private int age;

}
