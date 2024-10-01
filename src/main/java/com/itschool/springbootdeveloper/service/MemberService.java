package com.itschool.springbootdeveloper.service;

import com.itschool.springbootdeveloper.domain.Member;
import com.itschool.springbootdeveloper.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public void delete(String memberid) {
        Member member = findById(memberid);
        memberRepository.delete(member);
    }

    public Member create(Member member) {
        Member newMember = memberRepository.save(member);
        return newMember;
    }


    @Transactional(rollbackFor = RuntimeException.class)
    public Member update(String memberid, String password) {
        Member member = memberRepository.findById(memberid)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + memberid));

        member.updatePassword(password);

        return member;
    }
}
