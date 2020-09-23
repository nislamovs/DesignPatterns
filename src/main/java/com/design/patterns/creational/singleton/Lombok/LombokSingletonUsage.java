package com.design.patterns.creational.singleton.Lombok;

public class LombokSingletonUsage {

    public static void main(String[] args) {


        LombokUser lombokUser1 = LombokUser.getInstance();
        lombokUser1.setFirstname("Donald");
        lombokUser1.setLastname("Trump");
        lombokUser1.setAge(23);
        lombokUser1.setEmail("asdadada@gmail.com");
        lombokUser1.setPhoneNumber("23131312");

        LombokUser lombokUser2 = LombokUser.getInstance();

        System.out.println(lombokUser1);
        System.out.println(lombokUser2);

    }
}
