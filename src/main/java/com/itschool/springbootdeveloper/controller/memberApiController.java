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
@RequestMapping("/api/members")
public class memberApiController {


    private final MemberService memberService;

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberResponse> findMember(@PathVariable String memberId) {
        System.out.println(memberId);
        Member member = memberService.findById(memberId);
        return ResponseEntity.ok(new MemberResponse(member));
    }

    @GetMapping("")
    public ResponseEntity<List<MemberResponse>> findAllMembers() {
        List<MemberResponse> members = memberService.findAll()
                .stream().map(member -> new MemberResponse(member)).toList();
        return ResponseEntity.ok().body(members);
    }

    @PutMapping("{memberId}")
    public ResponseEntity<MemberResponse> updateMember(@PathVariable String memberId, @RequestBody String password) {
        Member member = memberService.update(memberId, password);

        return ResponseEntity.ok(new MemberResponse(member));
    }

    @DeleteMapping("{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(@PathVariable String memberId) {
        memberService.delete(memberId);

        return ResponseEntity.ok().build();
    }

    @PostMapping("")
    public ResponseEntity<MemberResponse> createMember(@RequestBody Member member) {
        Member newmember = memberService.create(member);
        return ResponseEntity.ok(new MemberResponse(newmember));
    }


}
