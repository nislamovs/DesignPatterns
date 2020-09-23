package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.lombok.LombokUser;
import com.design.patterns.creational.builder.plainJava.PlainJavaUser;

public class Usage {

    public static void main(String[] args) {

        //Lombok
        LombokUser user1 = LombokUser.builder().firstname("John").lastname("Smith").age(20).build();
        user1.toBuilder().email("john.smith@gmail.com").phoneNumber("123123").build();

        LombokUser user2 = LombokUser.builder().firstname("Bob").lastname("Dilan").age(40).email("bobdilan@inbox.lv").phoneNumber("2312312").build();

        //Plain Java
        PlainJavaUser user3 = new PlainJavaUser().setFirstname("Donald").setLastname("Trump").setAge(23).setEmail("donald666@gmail.com").setPhoneNumber("23131312");


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
