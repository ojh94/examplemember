package com.itschool.springbootdeveloper.dto;

import com.itschool.springbootdeveloper.domain.Member;
import lombok.Getter;

@Getter
public class MemberResponse {
    private final String memberid;
    private final String password;
    private final String name;
    private final String phone;
    private final String email;
    private final String nikname;
    private final String logindate;
    private final String address;

    public MemberResponse(Member member) {
        this.memberid = member.getMemberid();
        this.password = member.getPassword();
        this.name = member.getName();
        this.phone = member.getPhone();
        this.email = member.getEmail();
        this.nikname = member.getNikname();
        this.logindate = member.getLogindate();
        this.address = member.getAddress();
    }
}
