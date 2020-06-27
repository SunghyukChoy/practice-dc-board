package com.fakedc.practiceboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakedc.practiceboard.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
