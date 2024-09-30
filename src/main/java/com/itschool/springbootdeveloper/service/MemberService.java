package com.itschool.springbootdeveloper.service;

import com.itschool.springbootdeveloper.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {


    private final com.itschool.springbootdeveloper.repository.memberRepository memberRepository;

    public Member findById(Long memberid) {
        return memberRepository.findById(memberid).orElse(null);
    }
}
