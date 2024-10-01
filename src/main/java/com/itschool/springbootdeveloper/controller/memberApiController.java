package com.itschool.springbootdeveloper.controller;

import com.itschool.springbootdeveloper.domain.Member;
import com.itschool.springbootdeveloper.dto.MemberResponse;
import com.itschool.springbootdeveloper.entity.MemberEntity;
import com.itschool.springbootdeveloper.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member")
public class memberApiController {


    private final MemberService memberService;

    @GetMapping("/{memberid}")
    public ResponseEntity<MemberResponse> findMember(@PathVariable String memberid) {
        System.out.println(memberid);
        Member member = memberService.findById(memberid);
        return ResponseEntity.ok(new MemberResponse(member));
    }

    @GetMapping("")
    public ResponseEntity<List<MemberResponse>> findAllMembers() {
        List<MemberResponse> members = memberService.findAll()
                .stream().map(member -> new MemberResponse(member)).toList();

        return ResponseEntity.ok().body(members);
    }


}
