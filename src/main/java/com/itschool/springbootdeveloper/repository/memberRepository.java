package com.itschool.springbootdeveloper.repository;

import com.itschool.springbootdeveloper.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<Member, Long> {


}
