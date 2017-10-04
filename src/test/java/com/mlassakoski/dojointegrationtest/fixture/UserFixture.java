package com.mlassakoski.dojointegrationtest.fixture;

import com.mlassakoski.dojointegrationtest.entity.model.User;

import java.util.Calendar;

public class UserFixture {

    public static User build() {
        return new User().builder()
                .birthDate(Calendar.getInstance())
                .name("Cueio")
                .lastName("Bravo")
                .email("cueio@mail.com")
                .password("qwert")
                .status(true).build();
    }
}
