package com.itschool.springbootdeveloper.service;

import com.itschool.springbootdeveloper.domain.Member;
import com.itschool.springbootdeveloper.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {


    private final MemberRepository memberRepository;

    public Member findById(String memberid) {
        return memberRepository.findById(memberid).orElseThrow(() -> new IllegalArgumentException("not found: " + memberid));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
