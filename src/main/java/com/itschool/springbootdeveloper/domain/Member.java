package com.itschool.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {
    //@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Id
    @Column(updatable = false, nullable = false, unique = true)
    private String memberid;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,unique = true,updatable = false)
    private String name;

    @Column(nullable = false,unique = true)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String nikname;

    @Column(nullable = false)
    private String logindate;

    @Column(nullable = false)
    private String address;

    @Builder
    public Member(Long id, String memberId, String password, String name, String phone, String email, String nikname, String logindate, String address) {
        this.id = id;
        this.memberid = memberId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.nikname = nikname;
        this.logindate = logindate;
        this.address = address;
    }

    public void updatePassword(String password) {
        this.password = password;
    }
}
