package com.itschool.springbootdeveloper.controller;

import com.itschool.springbootdeveloper.domain.Member;
import com.itschool.springbootdeveloper.dto.MemberResponse;
import com.itschool.springbootdeveloper.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member")
public class memberApiController {

    private final MemberService memberService;

    @PostMapping("/{memberid}")
    public ResponseEntity<MemberResponse> findMember(@PathVariable Long memberid) {
        Member member = memberService.findById(memberid);

        return ResponseEntity.ok(new MemberResponse(member));
    }
}
