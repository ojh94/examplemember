package com.itschool.springbootdeveloper.dto;

import com.itschool.springbootdeveloper.domain.Member;
import lombok.Getter;

@Getter
public class MemberResponse {
    private final Long memberid;
    private final String name;
    private final String phone;
    private final String email;

    public MemberResponse(Member member) {
        this.memberid = member.getMemberid();
        this.name = member.getName();
        this.phone = member.getPhone();
        this.email = member.getEmail();
    }
}
