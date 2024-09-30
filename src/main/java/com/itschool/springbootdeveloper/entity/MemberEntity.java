package com.itschool.springbootdeveloper.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MemberEntity {
    private String name;
    private String phone;
    private String email;
}
